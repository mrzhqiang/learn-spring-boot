package com.github.mrzhqiang.learnspringboot;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Configuration;

/**
 * @author mrzhqiang
 */
@Configuration
public class WebConfiguration {
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
