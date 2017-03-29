package com.zcj.utils;


import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Since2017/3/21 ZhaCongJie@HF
 */
public class gameUtils {
    public static List<String> getCategoryList() {
        try {
            String categoryString = PropertiesLoaderUtils.loadAllProperties("config.properties").getProperty("category");
            if (StringUtils.isBlank(categoryString)) {
                return new ArrayList<>(0);
            }
            String[] categoryArray = categoryString.split(",");
            List<String> categoryList = new ArrayList<String>(categoryArray.length);
            for (String str : categoryArray) {
                categoryList.add(str.trim());
            }
            return categoryList;
        } catch (IOException e) {
            return new ArrayList<>(0);
        }

    }




}
