package com.example.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter 
{
  @Autowired
  private UserDetailsService userDetailsService;
  
  @Bean
  public BCryptPasswordEncoder passwordEncoder()
  {
    return new BCryptPasswordEncoder();
  };
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception 
  {
	  http.authorizeRequests()
//	  .antMatchers("/resources/**").permitAll()
	  .antMatchers("/user/").authenticated()
//	  .antMatchers("/pizza/addtocart/**").authenticated()
//	  .antMatchers("/pizza/buy/**").authenticated()
      .antMatchers("/product/add/**").hasAuthority("admin")
      .antMatchers("/user/delete/**").hasAuthority("admin")
//      .antMatchers("/buy/index/**").authenticated()
//      .antMatchers("/cart/add/**").authenticated()
      .antMatchers("/user/edit/**").hasAuthority("admin")
//      .antMatchers("**/https://test.instamojo.com/**").permitAll()
//      .antMatchers("https://7d6965f7.ngrok.io/**").permitAll()
      //.antMatchers("/**").hasAnyRole("ADMIN", "USER")
      .and().formLogin()
      
      .defaultSuccessUrl("/")
      .loginPage("/user/login").loginProcessingUrl("/user/loginaction").permitAll().failureUrl("/user/login-error")
      .and()
      .logout().logoutUrl("/user/logout")
      .invalidateHttpSession(true)
      .clearAuthentication(true)
      .deleteCookies("JESSIONID")
      .logoutSuccessUrl("/user/login")
      .and().csrf().disable();
  }
}