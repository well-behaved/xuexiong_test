/**
 * @author chenzhen@xiaomi.com
 * 2010-12-1 
 */

package com.xue.rose.controllers;

import net.paoding.rose.web.ControllerErrorHandler;
import net.paoding.rose.web.Invocation;

public class ErrorHandler implements ControllerErrorHandler {
    @Override
    public Object onError(Invocation inv, Throwable ex) throws Throwable {
        System.out.println("---错误处理执行难g----------------");

        // TODO logger.error("handle err:", ex);
        if (ex instanceof RuntimeException) {
            return "@runtime";
        }
        return "@error";
    }
}