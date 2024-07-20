package io.vinit.spring.basics.movierecommendersystem.lesson16;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ContentBasedFilter implements Filter {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  public ContentBasedFilter() {
    super();
    logger.info("In ContentBasedFilter constructor method");
  }

  //getRecommendations takes a movie as input and returns a list of similar movies
  public String[] getRecommendations(String movie) {

    //calculate similarity between movies

    //return movie recommendations
    return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
  }
}
