package com.example.Spring_core.Java_configuration.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//	Configuration class
@Configuration
// no need of component scan as @Component is not used on beans.
public class JavaConfig {
	
	//	Dependency Bean declaration
	//	default name of bean would be getDependency
	@Bean
	public DependencyClass getDependencyBean() {
		return new DependencyClass(10);
	}
	
	//	Dependent Bean declaration
	//	providing manual names; can be accessed any one of these.
	@Bean(name = {"example", "dep"})
	public DependentClass getDependentBean() {
		DependentClass ob = new DependentClass();
		ob.setDependency(getDependencyBean());
		ob.setY(20);
		return ob;
	}
}
