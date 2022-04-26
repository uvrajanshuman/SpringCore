package com.example.Spring_core.bean_scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

/*
 * Scope = Singleton
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //default scope no need to specify
public class DependentClass {
	@Autowired
	private DependencyClass dependency;

	public DependencyClass getDependency() {
		return dependency;
	}

	public void setDependency(DependencyClass dependency) {
		this.dependency = dependency;
	}
	
}
