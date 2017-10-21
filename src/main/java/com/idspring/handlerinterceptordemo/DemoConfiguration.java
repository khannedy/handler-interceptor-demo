package com.idspring.handlerinterceptordemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Eko Kurniawan Khannedy
 * @since 15/10/17
 */
@Configuration
public class DemoConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Add HandlerInterceptor to Registry
        registry.addInterceptor(new DemoInterceptor());
    }
}
