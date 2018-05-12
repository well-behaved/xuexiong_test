package com.xue.rose.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR,
        ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.PACKAGE})
public @interface FilterDemo {

}