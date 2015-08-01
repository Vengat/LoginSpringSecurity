//package com.auth.login.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@EnableWebMvc
//@Import({SecurityConfig.class})
//@ComponentScan(basePackages = "com.auth.login")
//public class LoginWebAppConfig {
//	
//	private static Logger logger = LoggerFactory.getLogger(LoginWebAppConfig.class);
//
//	@Bean
//    public InternalResourceViewResolver getInternalResourceViewResolver() {
//		logger.info("In the LoginWebAppConfig class. In the view resolver method");
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
//
//}
