package com.abashop.controller;

import com.abashop.pojo.Basket;
import com.abashop.service.BasketService;
import com.abashop.utils.RespUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @ClassName BasketController
 * @Description 用户购物车
 * @Author Zhang Qing
 * @Date 2020/11/10 16:11
 */
@RequestMapping("/cart")
@RestController
public class BasketController {

    @Resource
    private BasketService service;

    //    展示用户的购物车
    @GetMapping("/list")
    public RespUtil showBasket(HttpServletRequest servletRequest) {
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
        List<Basket> cartList = service.showUserCart(userId);
        List<Map<String, Object>> list = new ArrayList<>();
        for (Basket basket : cartList) {
            Map<String, Object> map = new HashMap<>();
            map.put("basketId", basket.getBasketId());
            map.put("num", basket.getNum());
            map.put("shopName", basket.getShop().getShopName());
            map.put("goodsName", basket.getGoods().getGoodsName());
            map.put("price", basket.getGoods().getPrice());
            list.add(map);
        }
        return new RespUtil("success", "用户购物车", cartList.size(), list);
    }

    //    往购物车里添加/修改记录
    @PostMapping("/save")
    public RespUtil saveCart(@RequestBody Basket basket, HttpServletRequest servletRequest) {
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
        Date date = new Date();
        int result = 0;
        if (basket.getBasketId() == null) {
            //新增 根据前端传过来的店铺名，商品名查找id信息存在cookie中吧方便存取 存入数据库
//            TODO 与前端交互，当用户点击加入购物车时，将一些信息存到session/cookie中
            Long shopId = (Long) servletRequest.getSession().getAttribute("shopId");
            Long goodsId = (Long) servletRequest.getSession().getAttribute("goodsId");
            basket.setGoodsId(goodsId);
            basket.setShopId(shopId);
            basket.setUserId(userId);
            basket.setBasketDate(date);
            result = service.addCartInfo(basket);
        } else {
            //修改，但是这个修改只能是修改商品数量，数量必须大于等于一
//            TODO num值从前端传过来的数据中取
            basket.setBasketDate(date);
            result = service.modifyCartInfo(basket);
        }
        if (result != 0) {
            return new RespUtil("success", "成功");
        } else {
            return new RespUtil("error", "出现错误了");
        }

    }

    //    删除记录
    public RespUtil deleteCartInfo(@RequestBody List<Long> basketIds, HttpServletRequest servletRequest) {
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
        if (service.deleteCartInfo(userId, basketIds) != 0) {
            return new RespUtil("success", "删除成功");
        }
        return new RespUtil("error", "哪里出错了呢");
    }

    //    全选删除
    @DeleteMapping("/deleteAll")
    private RespUtil deleteAll(HttpServletRequest servletRequest) {
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
        if (service.deleteByUser(userId) != 0) {
            return new RespUtil("success", "删除所有");
        } else {
            return new RespUtil("error", "出问题了！");
        }
    }

}
