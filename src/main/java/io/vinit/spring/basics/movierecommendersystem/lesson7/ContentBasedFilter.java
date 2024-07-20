package io.vinit.spring.basics.movierecommendersystem.lesson7;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
  public String[] getRecommendations(String movie) {
    //logic of content based filter
    return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
  }
}
