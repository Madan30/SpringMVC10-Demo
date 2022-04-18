package com.NepalCode.JavaBaseConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoginAppInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoginAppConfig.class);
		
		// Create the dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		// Register the dispatcher servlet and mapped the url
		ServletRegistration.Dynamic registration = servletContext.addServlet("MyServlet", dispatcherServlet);
		registration.addMapping("/");
		registration.setLoadOnStartup(1);
		
	}

}
