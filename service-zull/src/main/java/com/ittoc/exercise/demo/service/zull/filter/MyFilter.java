package com.ittoc.exercise.demo.service.zull.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright (C), 2018-2019
 * FileName: MyFilter
 * Author:   lix
 * Date:     2019-03-13 22:22
 * Description: zuul不仅只是路由，并且还能过滤，做一些安全验证。继续改造工程；
 * Version: V1.0.0
 */
@Component
public class MyFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(MyFilter.class);
    /**
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
     * @author xiaoyao
     * @date  2019-03-13 22:27
     * @return java.lang.String filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     * @since V1.0.0
     **/
    @Override
    public String filterType() {
        return "pre";
    }
    /**
     * ilterOrder：过滤的顺序
     * @author xiaoyao
     * @date  2019-03-13 22:28
     * @return int
     * @since V1.0.0
     **/
    @Override
    public int filterOrder() {
        return 0;
    }
    /**
     * shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
     * @author xiaoyao
     * @date  2019-03-13 22:28
     * @return boolean
     * @since V1.0.0
     **/
    @Override
    public boolean shouldFilter() {
        return true;
    }
    /**
     * run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     * @author xiaoyao
     * @date  2019-03-13 22:29
     * @param
     * @return java.lang.Object
     * @since V1.0.0
     **/
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("ok");
        return null;
    }

}
