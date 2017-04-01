package com.zcj.controller;

import com.zcj.domain.Category;
import com.zcj.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
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
        int pageSize = 100;
        List<Category> dataCategoryList =  categoryService.loadAll(pageSize);
        if (CollectionUtils.isEmpty(dataCategoryList)){
            return "toAdd";
        }
        modelMap.put("categoryList",dataCategoryList);
        return "toChoose";
    }
}
