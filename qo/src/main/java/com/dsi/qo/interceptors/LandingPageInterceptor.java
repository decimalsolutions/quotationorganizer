package com.dsi.qo.interceptors;

import static com.dsi.qo.staticConstants.Constants.INTERCEPTOR_AFTERCOMPLETION;
import static com.dsi.qo.staticConstants.Constants.INTERCEPTOR_POSTHANDLER;
import static com.dsi.qo.staticConstants.Constants.INTERCEPTOR_PREHANDLE;
import static com.dsi.qo.staticConstants.Constants.USER_KEY;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LandingPageInterceptor implements HandlerInterceptor {

	Logger logger = Logger.getLogger(LandingPageInterceptor.class);

	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object arg2, Exception exp) throws Exception {

		//
		// Enumeration enm = req.getAttributeNames();
		// while(enm.hasMoreElements()){
		// String attributeName = (String) enm.nextElement() ;
		// System.out.println(attributeName +
		// "::::::::>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
		// +req.getAttribute(attributeName));
		// if(attributeName.equals("org.springframework.web.servlet.DispatcherServlet.CONTEXT")){
		// System.out.println("TRUE");
		// WebApplicationContext context = (WebApplicationContext)
		// req.getAttribute("org.springframework.web.servlet.DispatcherServlet.CONTEXT");
		// System.out.println((Long)context.getStartupDate() + ""+
		// context.getServletContext().getServletContextName()); }
		// }

		logger.info(INTERCEPTOR_AFTERCOMPLETION);
	}

	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object arg2, ModelAndView mav) throws Exception {
		HttpServletRequestWrapper wrapper = new HttpServletRequestWrapper(req);
		System.out.println(wrapper.getAttribute("accept"));

		logger.info(INTERCEPTOR_POSTHANDLER);
	}

	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception {
		HttpSession session = req.getSession();
		Enumeration<String> sessionAttributeNames = session.getAttributeNames();
		while (sessionAttributeNames.hasMoreElements()) {
			String sessionAttributeName = sessionAttributeNames.nextElement();
			if (sessionAttributeName != null && sessionAttributeName.equals("SPRING_SECURITY_CONTEXT")) {
				SecurityContext sc = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
				logger.info("User " + sc.getAuthentication().getName() + " Authentication Done Before hitting to Interceptor handler");
			}
		}
		if (session.getAttribute(USER_KEY) == null) {
			// res.sendRedirect("login.htm");
			logger.info(INTERCEPTOR_PREHANDLE);
			return true;
		}
		return true;

	}

}
