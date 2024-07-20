package io.vinit.spring.basics.movierecommendersystem.lesson11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class RecommenderImplementation {

  private Logger logger = LoggerFactory.getLogger(this.getClass());
  private Filter filter;

  @Autowired
  public void setFilter(Filter filter) {
    logger.info("In RecommenderImplementation setter method..dependency injection");
    this.filter = filter;
  }

  //use a filter to find recommendations
  public String [] recommendMovies (String movie) {

    String[] results = filter.getRecommendations("Finding Dory");
    return results;
  }

  @PostConstruct
  public void postConstruct() {
    //initialization code
    logger.info("In RecommenderImplementation postConstruct method");
  }

  @PreDestroy
  public void preDestroy() {
    //cleanup code
    logger.info("In RecommenderImplementation preDestroy method");
  }
}
