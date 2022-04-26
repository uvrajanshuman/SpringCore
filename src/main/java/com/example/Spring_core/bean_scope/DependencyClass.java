package com.example.Spring_core.bean_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

/* 
 * Scope = Prototype
 * proxyMode= ScopedProxyMode.TARGET_CLASS = Instead of a real instance, a proxy gets autowired as dependency 
 * and whenever getDependency() is called a new dependency instance is returned.
 */
@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
		proxyMode= ScopedProxyMode.TARGET_CLASS)
public class DependencyClass {

}
