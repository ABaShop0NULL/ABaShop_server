package com.abashop.controller;

import com.abashop.pojo.Carousel;
import com.abashop.pojo.Goods;
import com.abashop.service.CarouselService;
import com.abashop.utils.RespUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CarouselController
 * @Description 轮播图
 * @Author Zhang Qing
 * @Date 2020/11/5 10:31
 */
@RestController
public class CarouselController {

    @Resource
    private CarouselService service;

    @GetMapping("/ads")
    public RespUtil showAdList() {
        List<Carousel> list = service.getAds();
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        for (Carousel carousel : list) {
            Map<String, Object> map = new HashMap<>();
            map.put("categoryId", carousel.getCategoryId());
            map.put("desc", carousel.getDes());
            map.put("imgId", carousel.getImgId());
            map.put("ingUrl", carousel.getImgUrl());
            listMap.add(map);
        }
        return new RespUtil("success", "轮播图", list.size(), listMap);
    }

    @DeleteMapping("/ads/delete/{imgId}")
    public RespUtil deleteAd(@PathVariable Long imgId) {
        if (service.deleteAd(imgId) != 0) {
            return new RespUtil("success", "删除");
        }
        return new RespUtil("error", "删除出错");
    }

    @RequestMapping(value = "/ads/add", method = RequestMethod.POST)
    public RespUtil addAds(Carousel carousel) {
        /*
         * TODO
         *  链表查询*/
        return new RespUtil();
    }
}
