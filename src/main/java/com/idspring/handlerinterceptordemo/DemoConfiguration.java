package com.idspring.handlerinterceptordemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Eko Kurniawan Khannedy
 * @since 15/10/17
 */
@Configuration
public class DemoConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Add HandlerInterceptor to Registry
        registry.addInterceptor(new DemoInterceptor());
    }
}
