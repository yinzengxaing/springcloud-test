package com.test.springcloudgateway.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class TokenFilter implements GatewayFilter, Ordered {

    private static final Log log = LogFactory.getLog(GatewayFilter.class);


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //获取token 信息
        ServerHttpRequest request = exchange.getRequest();
        String uri = request.getURI().toString();
        System.out.println(uri);

        return chain.filter(exchange);
    }


    /**
     * Ordered中的int getOrder()方法是来给过滤器设定优先级别的，值越大则优先级越低
     * @return
     */
    @Override
    public int getOrder() {
        return -99;
    }
}
