package io.vinit.spring.basics.movierecommendersystem.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages="io.vinit.spring.basics.movierecommendersystem.lesson10")
//@ComponentScan(includeFilters = @ComponentScan.Filter (type= FilterType.REGEX, pattern="io.vinit.spring.basics.movierecommendersystem.lesson9.*"))
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//check if beans are found
		System.out.println("CollaborativeFilter bean found = " + appContext.containsBean("collaborativeFilter"));
		System.out.println("ContentBasedFilter bean found = " + appContext.containsBean("contentBasedFilter"));
	}

}
