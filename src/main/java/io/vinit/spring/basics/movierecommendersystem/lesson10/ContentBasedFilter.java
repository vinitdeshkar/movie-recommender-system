package io.vinit.spring.basics.movierecommendersystem.lesson10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
  //for keeping track of instances created
  private static int instances= 0;

  @Autowired
  private Movie movie;

  public ContentBasedFilter() {
    instances++;
    System.out.println("ContentBasedFilter constructor called");
  }

  public Movie getMovie() {
    return movie;
  }

  public static int getInstances(){
    return ContentBasedFilter.instances;
  }

  @Override
  //getRecommendations takes a movie as input and returns a list of similar movies
  public String[] getRecommendations(String movie) {
    //calculate similarity between movies
    //return movie recommendations
    return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
  }
}
