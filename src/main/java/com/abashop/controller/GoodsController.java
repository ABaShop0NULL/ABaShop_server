package com.abashop.controller;

import com.abashop.pojo.Goods;
import com.abashop.service.GoodsService;
import com.abashop.utils.PageRequest;
import com.abashop.utils.RespUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @ClassName GoodsController
 * @Description 商品的操作接口
 * @Author Zhang Qing
 * @Date 2020/11/3 14:27
 */
@RestController
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    //    展示全部
    @RequestMapping(value = "/goods/all", method = RequestMethod.POST)
    public RespUtil goodsShow(@RequestParam Long shopId, HttpServletRequest servletRequest) {
//        TODO 需要测试查看返回数据
        shopId = (Long) servletRequest.getSession().getAttribute("shopId");
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        List<Goods> goodsList = goodsService.goodsShow(shopId);
        for (Goods goods : goodsList) {
            Map<String, Object> map = new HashMap<>();
            map.put("GoodsId", goods.getGoodsId());
            map.put("GoodsName", goods.getGoodsName());
            /*
             * .....
             * TODO:接口测试成功后继续添加要显示的数据
             * */
            listMap.add(map);
        }
        return new RespUtil("success", "成功", goodsList.size(), listMap);
    }

    /**
     * @return
     * @Author Zq
     * @Description 分页展示
     * @Date 2020/11/4 10:43
     * @Param 页码，每页展示数据大小
     **/
    @PostMapping("/goods/page")
    public Object goodsShowByPage(@RequestBody PageRequest pageQuery, HttpServletRequest servletRequest) {
        Long shopId = (Long) servletRequest.getSession().getAttribute("shopId");
        return goodsService.findPage(pageQuery, shopId);
    }

    @RequestMapping(value = "/goods/save", method = RequestMethod.POST)
    public RespUtil goodsSave(@RequestBody Goods goods, HttpServletRequest request) {
        //TODO 有问题，测试解决
        Long shopId = (Long) request.getAttribute("shopId");
        int result = 0;
        Date time = new Date();
        if (goods.getGoodsId() == null) { //新添
            goods.setGoodsId(shopId);
            goods.setCreateTime(time);
            goods.setPutawayTime(time);
//            商品分类这里 前端显示列表选择，根据选择返回对应的category_id      goods.setCategoryId();
            result = goodsService.goodsAdd(goods);
        } else { //更新
            goods.setUpdateTime(time);
            result = goodsService.goodsUpdate(goods);
        }
        if (result != 0) {
            return new RespUtil("success", "成功");
        }
        return new RespUtil("error", "字段规则匹配出问题");
    }

    @RequestMapping("/goods/status")
    public RespUtil goodsStatus(@RequestBody Goods goods) {
//        TODO 好像有问题，测试数据的时候再看
        if (goodsService.goodsStatus(goods) != 0) {
            return new RespUtil("success", "成功");
        }
        return new RespUtil("error", "");
    }
}
