package com.xue.demo.springcloub.zuul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class xueFilter  extends ZuulFilter {
    @Override
    public String filterType() {
//        pre：路由之前
//        routing：路由之时
//        post： 路由之后
//        error：发送错误调用
        return "pre";
    }

    @Override

    public int filterOrder() {
//        过滤的顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {
//        这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
        return true;
    }

    @Override
    public Object run() {
        System.out.println("-------过滤器开始执行-----");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        return null;
    }
}
