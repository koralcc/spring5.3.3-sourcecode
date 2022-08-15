package com.koral.spring.repository;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * spring
 *
 * @author koral
 * @date 2022/8/14 17:56
 */
public class MycustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//获取所有的beanName
		String beanNames[] = beanFactory.getBeanDefinitionNames();
		if (beanNames != null && beanNames.length > 0) {
			BeanDefinition beanDef = null;
			for (String beanName : beanNames) {
				//获取对应的bean定义
				beanDef = beanFactory.getBeanDefinition(beanName);
				this.printBeanDef(beanName, beanDef);
			}
		}
	}
	/**
	 * 打印bean定义的基本信息
	 * @param beanName
	 * @param beanDef
	 */
	private void printBeanDef(String beanName, BeanDefinition beanDef) {
		StringBuilder defStr = new StringBuilder("beanName: ").append(beanName);
		defStr.append(", className: ").append(beanDef.getBeanClassName());
		defStr.append(", scope: ").append(beanDef.getScope());
		defStr.append(", parent: ").append(beanDef.getParentName());
		defStr.append(", factoryBean: ").append(beanDef.getFactoryBeanName());
		defStr.append(", factoryMethod: ").append(beanDef.getFactoryMethodName());
		System.out.println(defStr);
	}

}
