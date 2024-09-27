package state.mn.us;

import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig extends DelegatingWebMvcConfiguration /* implements WebMvcConfigurer */ {

//	 @Override
//	   public void addResourceHandlers(ResourceHandlerRegistry registry) {  
//	    registry.addResourceHandler("/images/**").addResourceLocations("classpath:/images/");
//	    registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/");
//	   }
}
