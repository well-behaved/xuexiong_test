package com.xue.rose.controllers;

import com.xue.rose.bean.DemoBean;
import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.paramresolver.ParamMetaData;
import net.paoding.rose.web.paramresolver.ParamResolver;

public class ChenBeanResolver implements ParamResolver {

    @Override
    public Object resolve(Invocation inv, ParamMetaData metaData) throws Exception {
        for (String paramName : metaData.getParamNames()) {
            System.out.println("----------resolve方法开始执行-----------");
            if (paramName != null) {
                DemoBean demoBean = new DemoBean();
                String value1 = inv.getParameter("name1");
                int value2 = Integer.parseInt(inv.getParameter("age2"));
                demoBean.setAge(value2);
                demoBean.setName(value1);
                return demoBean;
            }
        }
        return null;

    }

    @Override
    public boolean supports(ParamMetaData metaData) {
        return DemoBean.class == metaData.getParamType();
    }

}