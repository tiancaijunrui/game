package com.zcj.utils.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Since2017/3/29 ZhaCongJie@HF
 */
@Target({ FIELD })
@Retention(RUNTIME)
public @interface Id {
}
