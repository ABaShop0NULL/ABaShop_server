package com.abashop.service;

import com.abashop.pojo.Area;

import java.util.List;

/**
 * @ClassName AreaService
 * @Author ASUS
 * @Date 2020/11/5 9:40
 */
public interface AreaService {
    //    获取省
    List<Area> selectProvinces();

    //    二级区域
    List<Area> selectCity(Long parentId);
}
