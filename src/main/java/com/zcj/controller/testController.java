package com.zcj.controller;

import com.zcj.domain.Category;
import com.zcj.service.CategoryService;
import com.zcj.utils.gameUtils;
import jdk.nashorn.internal.parser.JSONParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.UUIDEditor;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
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
    @RequestMapping(value = "/toAdd")
    public String toAdd(ModelMap modelMap){
        return "toAdd";
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelMap modelMap, String foodName, Boolean isMeat) {
        Category category = new Category();
        category.setMeat(isMeat);
        category.setFoodName(foodName);
        category.setSelectCount(0);
        category.setId(String.valueOf(UUID.randomUUID()).replaceAll("-",""));
        categoryService.save(category);
        return  new ModelAndView("toAdd","state",true);
    }
}
