package com.abashop.service.impl;

import com.abashop.mapper.GoodsMapper;
import com.abashop.pojo.Goods;
import com.abashop.service.GoodsService;
import com.abashop.utils.PageRequest;
import com.abashop.utils.PageResult;
import com.abashop.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName GoodsServiceImpl
 * @Description TODO
 * @Author Zhang Qing
 * @Date 2020/11/3 14:28
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;


    @Override
    public int goodsAdd(Goods goods) {
        return goodsMapper.insertSelective(goods);
    }

    @Override
    public int goodsUpdate(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public int goodsStatus(Goods goods) {
//        将商品状态置为-1
        return goodsMapper.updateStatus(goods);
    }

    @Override
    public List<Goods> goodsShow(Long shopId) {
        return goodsMapper.selectAll(shopId);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest, Long shopId) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, shopId));
    }

    public PageInfo<Goods> getPageInfo(PageRequest pageRequest, Long shopId) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goodsList = goodsMapper.selectAll(shopId);
        return new PageInfo<Goods>(goodsList);
    }
}
