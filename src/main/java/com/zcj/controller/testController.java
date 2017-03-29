package com.zcj.controller;

import com.zcj.domain.Category;
import com.zcj.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Since2017/3/20 ZhaCongJie@HF
 */

@Controller
@RequestMapping("/")
public class testController{

    @Autowired
    CategoryService categoryService;

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        modelMap.put("name","junrui");
        return "index";
    }

    @RequestMapping(value = "/toChoose",method = RequestMethod.GET)
    public String toLogin(ModelMap modelMap){
        Category category = new Category();
        category.setId(String.valueOf(UUID.randomUUID()).replaceAll("\\-",""));
        category.setFoodName("测试一号");
        category.setMeat(false);
        category.setSelectCount(0);
        categoryService.save(category);
        return "toChoose";
    }
}
