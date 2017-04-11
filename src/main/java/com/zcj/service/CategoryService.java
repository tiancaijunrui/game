package com.zcj.service;

import com.zcj.domain.Category;
import com.zcj.utils.annotation.MyBatisService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Since2017/3/27 ZhaCongJie@HF
 */

public interface CategoryService {
    void save(Category category);
    Category load(String id);
    List<Category> loadAll(int pageSize);
    void batchDelete(List<String> categoryIds);
    void update(Category category);
}
