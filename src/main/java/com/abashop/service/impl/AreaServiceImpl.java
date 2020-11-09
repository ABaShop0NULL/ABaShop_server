package com.abashop.service.impl;

import com.abashop.mapper.AreaMapper;
import com.abashop.pojo.Area;
import com.abashop.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AreaServiceImpl
 * @Description TODO
 * @Author Zhang Qing
 * @Date 2020/11/5 9:40
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaMapper areaMapper;

    @Override
    public List<Area> selectProvinces() {
        return areaMapper.selectProvinces();
    }

    @Override
    public List<Area> selectCity(Long parentId) {
        return areaMapper.selectCity(parentId);
    }
}
