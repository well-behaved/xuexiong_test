package com.xue.rose.controllers;

import com.xue.rose.annotation.NotBlank;
import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.ParamValidator;
import net.paoding.rose.web.paramresolver.ParamMetaData;
import org.apache.commons.lang.StringUtils;
import org.springframework.validation.Errors;

public class NotBlankParamValidator implements ParamValidator {

    @Override
    public boolean supports(ParamMetaData metaData) {
        return metaData.getAnnotation(NotBlank.class) != null;
    }

    @Override
    public Object validate(ParamMetaData metaData, Invocation inv, Object target, Errors errors) {
       System.out.println("校验开始执行----------------------");
        String paramName = metaData.getParamName();
        String value = inv.getParameter(paramName);
        if (StringUtils.isBlank(value)) {
            return "@参数不能为空";
        }
        return null;
    }
}