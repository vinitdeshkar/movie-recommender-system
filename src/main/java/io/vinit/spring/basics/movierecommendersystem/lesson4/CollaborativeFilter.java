package io.vinit.spring.basics.movierecommendersystem.lesson4;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CollaborativeFilter implements Filter {
  public String[] getRecommendations(String movie) {
    //logic of collaborative filter
    return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
  }
}
