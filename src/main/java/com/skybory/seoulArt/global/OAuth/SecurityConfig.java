//package com.skybory.seoulArt.global.OAuth;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	private final CustomOAuth2UserService customOAuth2UserService;
//
//	public SecurityConfig(CustomOAuth2UserService customOAuth2UserService) {
//
//		this.customOAuth2UserService = customOAuth2UserService;
//	}
//
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//		http.csrf((csrf) -> csrf.disable());
////		http.cors(null);			// 방금 추가함
//
//		http.formLogin((login) -> login.disable());
//
//		http.httpBasic((basic) -> basic.disable());
//
//		http.oauth2Login(
//				(oauth2) -> oauth2.loginProcessingUrl("/login/oauth2/code/**").loginPage("/login").userInfoEndpoint(
//						(userInfoEndpointConfig) -> userInfoEndpointConfig.userService(customOAuth2UserService)));
//
//		http.authorizeHttpRequests(
//				(auth) -> auth.requestMatchers("/", "/login")
//				.permitAll()
//				.anyRequest()
//				.authenticated());
//
//		return http.build();
//	}
//}