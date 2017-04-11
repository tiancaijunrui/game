package com.zcj.test;

import java.util.UUID;

/**
 * @Since2017/4/11 ZhaCongJie@HF
 */
public class demo {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(uuid);
    }

}
