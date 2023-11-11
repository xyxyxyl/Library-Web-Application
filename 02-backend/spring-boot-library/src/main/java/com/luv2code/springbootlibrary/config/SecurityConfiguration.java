package com.luv2code.springbootlibrary.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //Disable Cross Site Request Forgery
        http.csrf().disable();
        //Protect endpoints at  /api/<type>/secure
        http.authorizeHttpRequests(requests ->
                requests
                        .requestMatchers("/api/books/secure/**")
                        .authenticated()
                        .anyRequest().permitAll())
                .oauth2ResourceServer(oauth2ResourceServer -> oauth2ResourceServer.jwt(Customizer.withDefaults()));

        //add CORS filters
        http.cors(Customizer.withDefaults());

        //add content to out negotiation strategy
        http.setSharedObject(ContentNegotiationStrategy.class,
                new HeaderContentNegotiationStrategy());

        //Force a non-empty response body for 401s to make the response friendly
        Okta.configureResourceServer401ResponseBody(http);

        return http.build();
    }
}
