package com.koral.spring.repository;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

import static org.springframework.beans.factory.support.AbstractBeanDefinition.AUTOWIRE_BY_NAME;


/**
 * spring
 *
 * @author koral
 * @date 2022/8/18 22:45
 */

// BeanDefinitionRegistryPostProcessor 侧重于新建beanDefinition
// BeanFactoryPostProcessor 侧重于修改
public class MyBeanDefitionRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		//创建BeanDefinitionBuilder
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(UserInfoEntity.class);
		//设置属性值
		builder.addPropertyValue("name", "list_test");
		//设置可通过@Autowire注解引用
		builder.setAutowireMode(AUTOWIRE_BY_NAME);
		//注册到BeanDefinitionRegistry
		registry.registerBeanDefinition("userInfoEntity", builder.getBeanDefinition());
	}


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
