package com.github.mrzhqiang.learnspringboot;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mrzhqiang
 */
@Configuration
public class WebConfiguration {
  @Bean
  public RemoteIpFilter remoteIpFilter() {
    return new RemoteIpFilter();
  }

  @Bean
  public FilterRegistrationBean<MyFilter> testFilterRegistration() {
    FilterRegistrationBean<MyFilter> bean = new FilterRegistrationBean<>();
    bean.setFilter(new MyFilter());
    bean.addUrlPatterns("/*");
    bean.addInitParameter("paramName", "paramValue");
    bean.setName("MyFilter");
    bean.setOrder(1);
    return bean;
  }

  public static class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
      HttpServletRequest servletRequest = (HttpServletRequest) request;
      System.out.println("This is MyFilter url: " + servletRequest.getRequestURI());
      chain.doFilter(request, response);
    }
  }
}
