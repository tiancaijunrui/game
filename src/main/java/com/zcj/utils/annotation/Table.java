package com.zcj.utils.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Since2017/3/29 ZhaCongJie@HF
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface Table {
    String shared() default "";

    String schema() default "";

    String tableName();
}
