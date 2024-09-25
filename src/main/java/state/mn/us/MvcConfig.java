package state.mn.us;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer {

	 @Override
	   public void addResourceHandlers(ResourceHandlerRegistry registry) {  
	    registry.addResourceHandler("/images/**").addResourceLocations("/images/");
	    registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/");
	   }
}
