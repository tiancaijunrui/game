package com.zcj.impl;

import com.zcj.domain.Category;
import com.zcj.map.CategoryMapper;
import com.zcj.service.CategoryService;
import com.zcj.utils.annotation.MyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Since2017/3/29 ZhaCongJie@HF
 */

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public void save(Category category) {
        categoryMapper.save(category);
    }

    @Override
    public Category load(String id) {
        return categoryMapper.load(id);
    }
}
