package com.abashop.service.impl;

import com.abashop.mapper.BasketMapper;
import com.abashop.pojo.Basket;
import com.abashop.service.BasketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BasketServiceImpl
 * @Description TODO
 * @Author Zhang Qing
 * @Date 2020/11/13 14:20
 */
@Service
public class BasketServiceImpl implements BasketService {

    @Resource
    private BasketMapper mapper;

    @Override
    public List<Basket> showUserCart(Long userId) {
        return mapper.selectCartByUser(userId);
    }

    @Override
    public int addCartInfo(Basket basket) {
        return mapper.insert(basket);
    }

    @Override
    public int modifyCartInfo(Basket basket) {
        return mapper.updateByPrimaryKeySelective(basket);
    }

    @Override
    public int deleteCartInfo(Long userId, List<Long> basketIds) {
        return mapper.deleteBatch(userId, basketIds);
    }

    @Override
    public int deleteByUser(Long userId) {
        return mapper.deleteByUser(userId);
    }
}
