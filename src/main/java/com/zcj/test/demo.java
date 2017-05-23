package com.zcj.test;

import java.util.UUID;

/**
 * @Since2017/4/11 ZhaCongJie@HF
 */
public class demo {
    public static void main(String[] args) {
        int i= 0;

        while (i < 12683){
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            System.out.println(uuid);
            i++;
        }

    }

}
