/**
 * Not In Use...
 */
package com.dsi.qo.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.context.ApplicationContext;

public class CustomizeFilterProxy implements Filter {

	ApplicationContext applicationContext;

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		Filter delegate = (Filter) applicationContext.getBean("springSecuirtyFilterChain");
		delegate.doFilter(arg0, arg1, arg2);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
