package com.abashop.controller;

import com.abashop.pojo.Area;
import com.abashop.service.AreaService;
import com.abashop.utils.RespUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AreaController
 * @Description 地址接口
 * @Author Zhang Qing
 * @Date 2020/11/5 9:39
 */
@RestController
public class AreaController {

    @Resource
    private AreaService areaService;

    public List<Map<String, Object>> listFormat(List<Area> list) {
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        for (Area area : list) {
            Map<String, Object> map = new HashMap<>();
            map.put("areaId", area.getAreaId());
            map.put("areaName", area.getAreaName());
            map.put("parentId", area.getParentId());
            map.put("level", area.getLevel());
            listMap.add(map);
        }
        return listMap;
    }

    //    获取省市列表 sys level=1
    @GetMapping("/sys/province")
    public RespUtil provinces() {
        List<Area> areaList = areaService.selectProvinces();
        return new RespUtil("success", "省级行政区", areaList.size(), listFormat(areaList));
    }

    //    区域列表 sys 根据parentID获取
    @GetMapping("/sys/city")
    public RespUtil city(Long parentId) {
        List<Area> cityList = areaService.selectCity(parentId);
        return new RespUtil("success", "城市", cityList.size(), listFormat(cityList));
    }

//    TODO 待添加管理员可以更改信息
}
