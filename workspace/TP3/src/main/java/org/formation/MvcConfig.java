package org.formation;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	registry.addViewController("/").setViewName("home");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/web/documents").setViewName("documents");
        registry.addViewController("/spring_login").setViewName("spring_login");
  
       
        registry.addViewController("/spring_secured").setViewName("spring_secured");
        
        // Pour surcharger index.html
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

}