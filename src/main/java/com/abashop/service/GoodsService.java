package com.abashop.service;

import com.abashop.pojo.Goods;
import com.abashop.utils.PageRequest;
import com.abashop.utils.PageResult;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ClassName GoodsService
 * @Description goods接口抽象类
 * @Author ASUS
 * @Date 2020/11/3 14:28
 */
public interface GoodsService {

    /*
     * 增删改查
     * 查：对商户展示自家的产品
     * 删除：更改商品的状态为-1 不可查（不展示给商铺）
     * */
    int goodsAdd(Goods goods);

    int goodsUpdate(Goods goods);

    int goodsStatus(Goods goods);

    //    展示所有商品
    List<Goods> goodsShow(Long shopId);

    PageResult findPage(PageRequest pageRequest, Long shopId);
}
