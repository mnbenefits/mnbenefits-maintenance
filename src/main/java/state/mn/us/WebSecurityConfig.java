package state.mn.us;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{

	@Bean
	public SecurityFilterChain securityFilterChain1(HttpSecurity http) throws Exception {
		http
		.headers((headers) -> headers
				.cacheControl(Customizer.withDefaults())// no-cache, no-store, max-age=0, must-revalidate
				)
			.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
}
