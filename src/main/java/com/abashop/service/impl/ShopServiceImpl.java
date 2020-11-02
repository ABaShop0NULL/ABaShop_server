package com.abashop.service.impl;

import com.abashop.mapper.ShopMapper;
import com.abashop.pojo.Shop;
import com.abashop.pojo.User;
import com.abashop.service.ShopService;
import com.abashop.utils.RespUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @ClassName ShopServiceImpl
 * @Description 商铺接口实现
 * @Author Zhang Qing
 * @Date 2020/11/2 14:23
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    private ShopMapper shopMapper;

    /*
     * 关于商铺的登录逻辑：
     * 判断用户是否登录，登录就查询是否绑定了商铺信息，有跳转到商铺管理页面
     * 无就提示是否需要开一家店（注册）
     * */
    @Override
    public Shop shopDetails(String userName) {
        return shopMapper.selectByUser(userName);
    }

    @Override
    public int shopAdd(Shop shop) {
        return shopMapper.insertSelectiveSelf(shop);
    }

    @Override
    public int shopUpdate(Shop shop) {
        return shopMapper.updateByUserSelective(shop);
    }


}
