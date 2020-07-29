package com.xijue.urule;

import com.bstek.urule.console.servlet.URuleServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;

/**
 * Description： URuleServletRegistration
 * Author: xijue987654
 * Date: Created in 2020/7/27 10:26
 * Version: 1.0
 */
@Component
public class URuleServletRegistration {
    @Bean
    public ServletRegistrationBean<HttpServlet> registerURuleServlet() {
        return new ServletRegistrationBean<HttpServlet>(new URuleServlet(), "/urule/*");
    }
}