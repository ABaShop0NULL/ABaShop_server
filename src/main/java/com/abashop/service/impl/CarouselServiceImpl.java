package com.abashop.service.impl;

import com.abashop.mapper.CarouselMapper;
import com.abashop.pojo.Carousel;
import com.abashop.service.CarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CarouselServiceImpl
 * @Description TODO
 * @Author Zhang Qing
 * @Date 2020/11/5 10:33
 */
@Service
public class CarouselServiceImpl implements CarouselService {

    @Resource
    private CarouselMapper mapper;

    @Override
    public List<Carousel> getAds() {
        return mapper.selectAll();
    }

    @Override
    public int deleteAd(Long imgId) {
        return mapper.deleteByPrimaryKey(imgId);
    }

    @Override
    public int addAd(Carousel carousel) {
        return mapper.insertSelective(carousel);
    }
}
