package com.zcj.test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;

/**
 * @Since2017/3/21 ZhaCongJie@HF
 */
public class testMain {
    public static void main(String[] args) throws IOException, BiffException, WriteException {
//        String str = "猪肉,牛肉,羊肉,其他肉类,奶制品,鸡肉,鸭肉,蛋类,其他禽类,贝类,其它海鲜水产,根茎蔬菜,米、面食、粉,茎叶蔬菜,腌咸蔬菜,瓜果蔬菜,豆制品,干果豆类,菜系,口味,蟹类,水果,鱼肉,虾类,菌类";
//        Workbook workbook = Workbook.getWorkbook(new File("D:\\IdeaProjects\\game\\src\\main\\resources\\excel\\food.xls"));
//        WritableWorkbook workbook1 = Workbook.createWorkbook(new File("D:\\IdeaProjects\\game\\src\\main\\resources\\excel\\food.xls"),workbook);
//        WritableSheet sheet = workbook1.createSheet("category",1);
//        for (int i = 0 ; i < str.split(",").length ; i ++){
//           sheet.addCell(new Label(0,i+1,str.split(",")[i].trim()));
//        }
//        workbook1.write();
//        workbook1.close();
//        System.out.println("done");

        String aaaa = "12";
        System.out.println(aaaa.substring(0,3));
    }
}
