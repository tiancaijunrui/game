package com.zcj.map;

import com.zcj.domain.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Since2017/3/27 ZhaCongJie@HF
 */
@Repository
public interface CategoryMapper {
    void save(Category category);
    Category load(String id);
    List<Category> loadAll(int pageSize);
    void batchDelete(List<String> categoryIds);
    void update(Category category);
    List<Category> loadByIdList(List<String> categoryIdList);
    void batchUpdate(List<Category> categoryList);

}
