package samplemvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan({"samplemvc"})
public class WebConfig implements WebMvcConfigurer {
	
	public void addViewController(ViewControllerRegistry registry)
	{
		registry.addViewController("/").setViewName("index");
	}
}
