InMemoryUserDetailsService userDetailsService(){
    UserDetails userDetails=User.builder().username("bean").password(passwordEncoder().encode("master")).roles("USER").build();
    UserDetails adminDetails=User.builder().username("bond").password(passwordEncoder().encode("james")).roles("ADMIN").build();
}

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/api/v1/create-user").hasRole("ADMIN")
            .antMatchers("jndfznxfhbxhbkdfgfcg").hasAnyRole("ADMIN","USER")
            .antMatchers("/hbj/bj/kmkm/**").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and().httpBasic();
    }

    http.csrf().disable()
        .authorizeRequests()
        .antMatchers("endpoint").hasRole("ADMIN")
}

http.csrf().disable()
.authorizeRequests()
.antMatchers("/api/v1")