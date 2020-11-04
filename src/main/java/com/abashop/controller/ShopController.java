package com.abashop.controller;

import com.abashop.pojo.Shop;
import com.abashop.service.ShopService;
import com.abashop.utils.RespUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @ClassName ShopController
 * @Description 与商铺相关的操作
 * @Author Zhang Qing
 * @Date 2020/11/2 14:21
 */
@RestController
public class ShopController {

    @Resource
    private ShopService shopService;


    @RequestMapping("/shop/details")
    public RespUtil shopDetails(HttpServletRequest servletRequest) {
//        这里需要的用户信息可以从session中获取
        /*
         * TODO:这里有问题，测试看返回数据
         *  */
        String userName = String.valueOf(servletRequest.getSession().getAttribute("userName"));
        Shop result = shopService.shopDetails(userName);
        if (result != null) {
            servletRequest.setAttribute("shopId", result.getShopId());
            servletRequest.setAttribute("shopName", result.getShopName());
            return new RespUtil("success", "匹配成功");
        }
        return new RespUtil("error", "匹配失误，信息有误");
    }

    //    添加和更新
    @PostMapping("/shop/save")
//    @RequestMapping(value = "/shop/save", method = RequestMethod.POST)
    public RespUtil shopSave(@RequestBody Shop shop, HttpSession session) {
        int result = 0;
        String userName = String.valueOf(session.getAttribute("userName"));
        if (shop.getShopId() == null) {//添加
            shop.setCreateTime(new Date());
            shop.setShopName(userName);
            result = shopService.shopAdd(shop);
        } else {//更新
            /*
             * 信息更改：店名，状态(-1注销店铺,另处理)，logo
             * */
            result = shopService.shopUpdate(shop);
        }
        if (result != 0) {
            session.setAttribute("shop", shop.getShopName());
            return new RespUtil("success", "匹配成功");
        }
        return new RespUtil("error", "匹配失误，信息有误");
    }

//    关闭店铺 将店铺状态置为-1

}
