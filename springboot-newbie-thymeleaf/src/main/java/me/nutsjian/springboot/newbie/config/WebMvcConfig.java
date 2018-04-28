package me.nutsjian.springboot.newbie.config;

import me.nutsjian.springboot.newbie.interceptor.ErrorHandlerInterceptor;
import me.nutsjian.springboot.newbie.interceptor.ThymeleafLayoutInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // order 越大越先执行，看源码 InterceptorRegistry 即可知道，里面有个 默认的 INTERCEPTOR_ORDER_COMPARATOR 比较器
        registry.addInterceptor(new ErrorHandlerInterceptor()).order(1000000);
        registry.addInterceptor(new ThymeleafLayoutInterceptor()).order(2);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 静态资源配置
        registry.addResourceHandler("/static/**/*.js").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/static/**/*.css").addResourceLocations("classpath:/static/");
    }

}
