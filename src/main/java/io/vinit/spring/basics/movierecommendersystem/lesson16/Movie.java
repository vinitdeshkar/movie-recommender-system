package io.vinit.spring.basics.movierecommendersystem.lesson16;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  private int id;
  private String name;
  private String genre;
  private String producer;

  public Movie() {
    super();
    logger.info("In Movie constructor method");
  }

  public double movieSimilarity(int movie1, int movie2) {

    double similarity = 0.0;

    //if genres are same add 0.3 to similarity
    //if producers are same add 0.5 to similarity

    return similarity;
  }
}
