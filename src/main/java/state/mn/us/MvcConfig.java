package state.mn.us;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig /* extends DelegatingWebMvcConfiguration */  implements WebMvcConfigurer  {

//	 @Override
//	   public void addResourceHandlers(ResourceHandlerRegistry registry) {  
//	    registry.addResourceHandler("/images/**").addResourceLocations("classpath:/images/");
//	    registry.addResourceHandler("/fonts/**").addResourceLocations("classpath:/fonts/");
//	    registry.addResourceHandler("/documents/**").addResourceLocations("classpath:/documents/");
//	   }
//	
//	@Override
//	public void configurePathMatch(PathMatchConfigurer configurer) {
//		configurer.addPathPrefix("/api", HandlerTypePredicate.forAnnotation(Controller.class));
//	}
}
