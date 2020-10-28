package com.abashop.pojo;

public class Area {
    private Long areaId;

    private String areaName;

    private Long parentId;

    private Integer level;

    public Area(Long areaId, String areaName, Long parentId, Integer level) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.parentId = parentId;
        this.level = level;
    }

    public Area() {
        super();
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}