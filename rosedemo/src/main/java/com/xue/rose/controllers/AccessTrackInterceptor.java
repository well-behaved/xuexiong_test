package com.xue.rose.controllers;

import com.xue.rose.common.FilterDemo;
import net.paoding.rose.web.ControllerInterceptorAdapter;
import net.paoding.rose.web.Invocation;

import java.lang.annotation.Annotation;

public class AccessTrackInterceptor extends ControllerInterceptorAdapter {
    public AccessTrackInterceptor() {
        setPriority(29600);
    }

    @Override
    public Class<? extends Annotation> getRequiredAnnotationClass() {
        System.out.println("--------拦截器 getRequiredAnnotationClass-----------------");
        return FilterDemo.class; // 这是一个注解，只有标过的controller才会接受这个拦截器的洗礼。
    }

    @Override
    public Object before(Invocation inv) throws Exception {
        System.out.println("--------拦截器 before-----------------");
        return super.before(inv);
    }

    @Override
    public void afterCompletion(final Invocation inv, Throwable ex) throws Exception {
        System.out.println("--------拦截器 afterCompletion-----------------");

    }
}