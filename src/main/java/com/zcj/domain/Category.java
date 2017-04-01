package com.zcj.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @Since2017/3/27 ZhaCongJie@HF
 */

public class Category implements Serializable{

    private String id;
    private String foodName;
    private Boolean isMeat;
    private Integer selectCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Boolean getMeat() {
        return isMeat;
    }

    public void setMeat(Boolean meat) {
        isMeat = meat;
    }

    public Integer getSelectCount() {
        return selectCount;
    }

    public void setSelectCount(Integer selectCount) {
        this.selectCount = selectCount;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", isMeat=" + isMeat +
                ", selectCount=" + selectCount +
                '}';
    }
}
