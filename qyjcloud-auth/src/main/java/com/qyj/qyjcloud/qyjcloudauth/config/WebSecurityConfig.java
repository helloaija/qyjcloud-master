package com.qyj.qyjcloud.qyjcloudauth.config;

import com.qyj.qyjcloud.qyjcloudauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private UserService userService;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        // http.formLogin().permitAll().and()
        //         .logout().logoutUrl("/logout").logoutSuccessUrl("/").and()
        //         // 所有请求都需要安全验证
        //         .authorizeRequests().anyRequest().authenticated()
        //         .and().csrf().disable()
        //         .httpBasic();
        http.csrf().disable()
                .exceptionHandling()
                // 验证不通过，定位到401界面
                .authenticationEntryPoint((request, response, authExceptin) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
                .and().authorizeRequests().anyRequest().authenticated()
                .and().httpBasic();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 配置验证用户信息源和密码加密策略
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public static BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 开启密码类型验证
     * @return
     * @throws Exception
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
