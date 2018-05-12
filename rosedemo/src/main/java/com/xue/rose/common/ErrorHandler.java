/**
 * @author chenzhen@xiaomi.com
 * 2010-12-1
 */

package com.xue.rose.common;

import net.paoding.rose.web.ControllerErrorHandler;
import net.paoding.rose.web.Invocation;

public class ErrorHandler implements ControllerErrorHandler {
    @Override
    public Object onError(Invocation inv, Throwable ex) {

        // TODO logger.error("handle err:", ex);
        if (ex instanceof RuntimeException) {
            System.out.println("出现了错误 runtime");
            return "@nihao";
        }
        System.out.println("出现了错误 error");
        return "@demo";
    }
}