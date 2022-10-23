package com.tenpo.calculate.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tenpo.calculate.api.controllers.filters.AuthorizationFilter;
import com.tenpo.calculate.api.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculateApiApplication.class, args);
	}

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private JwtUtil jwtUtil;

	@Bean
	FilterRegistrationBean<AuthorizationFilter> authorizationFilterFilterRegistrationBean(){
		final FilterRegistrationBean<AuthorizationFilter> filterFilterRegistrationBean = new FilterRegistrationBean<AuthorizationFilter>();
		filterFilterRegistrationBean.setFilter(new AuthorizationFilter(objectMapper, jwtUtil));
		filterFilterRegistrationBean.addUrlPatterns("/tenpo/calculate", "/tenpo/history");

		return  filterFilterRegistrationBean;
	}

}
