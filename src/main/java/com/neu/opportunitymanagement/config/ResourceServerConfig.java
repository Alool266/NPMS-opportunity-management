package com.neu.opportunitymanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    /**
     * token service configuration
     */
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenServices(tokenServices());
    }

    /**
     * Routing Security Authentication Configuration
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // New customers (authority: account manager, sales director)
                .antMatchers(HttpMethod.POST,"/oppManagement/opportunity/addOpportunity").hasAnyRole("30000010","30000030")
                // Customer modification (authority: account manager, sales director, marketing specialist)
                .antMatchers(HttpMethod.POST,"/oppManagement/opportunity/showUpdatePage").hasAnyRole("30000010","30000030")
                // Customer Freeze (Authority: Marketing Specialist)
                .antMatchers(HttpMethod.POST,"/oppManagement/opportunity/updateOpportunity").hasAnyRole("30000010","30000030")
                // Export customer information (authority: vice president of marketing, marketing specialist)
                .antMatchers(HttpMethod.GET,"/oppManagement/opportunity/getOppTrackMainPage").hasAnyRole("30000010","30000030")
                // 机会跟踪（权限：客户经理，销售总监）
                .antMatchers(HttpMethod.POST,"/oppManagement/opportunity/curdTrackinglog").hasAnyRole("30000010","30000030")
                // Customer Handover (Authority: Marketing Specialist)
                .antMatchers(HttpMethod.GET,"/oppManagement/opportunity/getApprovalPage").hasAnyRole("30000010","10000030","20000010")
                // Click the "Approve" button to display the opportunity approval information (authority: sales director, general manager of business department, vice president of marketing)
                .antMatchers(HttpMethod.GET,"/oppManagement/opportunity/showOppApproveDetail").hasAnyRole("30000010","10000030","20000010")
                // Submit approval opinions (authority: sales director, general manager of business department, vice president of marketing)
                .antMatchers(HttpMethod.POST,"/oppManagement/opportunity/approval").hasAnyRole("30000010","10000030","20000010")

                .anyRequest().authenticated();
    }

    /**
     * jwt token Validation parser
     */
    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(accessTokenConverter());
    }

    /**
     * Token The converter must be consistent with the authentication service
     */
    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
        accessTokenConverter.setSigningKey("YoCiyy");
        return accessTokenConverter;
    }

    /**
     * Resource Service Token Resolution Service
     */
    @Bean
    @Primary
    public ResourceServerTokenServices tokenServices() {
        RemoteTokenServices remoteTokenServices = new RemoteTokenServices();
        remoteTokenServices.setCheckTokenEndpointUrl("http://localhost:15000/oauth/check_token");
        remoteTokenServices.setClientId("client_1");
        remoteTokenServices.setClientSecret("123456");
        return remoteTokenServices;
    }
}

