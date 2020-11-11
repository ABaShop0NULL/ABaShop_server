package com.abashop.service;

import com.abashop.pojo.Carousel;

import java.util.List;

/**
 * @ClassName CarouselService
 * @Description 轮播图抽象类
 * @Author ASUS
 * @Date 2020/11/5 10:33
 */
public interface CarouselService {
    //    展示图片
    List<Carousel> getAds();

    //    删除广告
    int deleteAd(Long imgId);

    //    增加
    int addAd(Carousel carousel);
//    就不写修改了 删了新建
}
