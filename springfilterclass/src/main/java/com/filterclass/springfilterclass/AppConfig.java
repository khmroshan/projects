package com.filterclass.springfilterclass;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilterRegistrationBean<MyFilter> filterRegistrationBean() {
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean();
        MyFilter myfilter = new MyFilter();
        registrationBean.setFilter(myfilter);
        registrationBean.addUrlPatterns("/api/*");
        registrationBean.setOrder(2); 
        return registrationBean;
    }
}