package io.vinit.spring.basics.movierecommendersystem.lesson10;

import org.springframework.stereotype.Component;

import io.vinit.spring.basics.movierecommendersystem.lesson8.Filter;

@Component
public class CollaborativeFilter implements Filter {
  public String[] getRecommendations(String movie) {
    //logic of collaborative filter
    return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
  }
}
