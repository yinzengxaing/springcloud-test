package com.test.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.http.protocol.RequestContent;
import org.springframework.context.annotation.FilterType;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 登录过滤器 拦截登录请求
 */
public class LoginFilter extends ZuulFilter {

    @Override
    public String filterType() {
        //过滤器内容

        return "pre";
    }

    @Override
    public int filterOrder() {


        return 1;
    }

    @Override
    public boolean shouldFilter() {
        //判断过滤器是否执行 true 执行 false 不执行
        return true;
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String requestURI = request.getRequestURI();
        Cookie[] cookies = request.getCookies();
        System.out.println(cookies);
        System.out.println(requestURI);

        return null;
    }
}
