package com.since;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program:
 * @description:
 * @author: SY_zheng
 * @create: 2019-11-04
 */
public class Test {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(Appconfig.class);
		System.err.println(annotationConfigApplicationContext.getBean(CityService.class));

	}

}
