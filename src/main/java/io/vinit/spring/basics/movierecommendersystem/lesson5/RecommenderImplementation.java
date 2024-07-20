package io.vinit.spring.basics.movierecommendersystem.lesson5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
  //use filter interface to select filter
  @Autowired
  private Filter collaborativeFilter;
  public RecommenderImplementation(Filter collaborativeFilter) {
    super();
    this.collaborativeFilter = collaborativeFilter;
  }

  //use a filter to find recommendations
  public String [] recommendMovies (String movie) {
    //print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + collaborativeFilter + "\n");
    return collaborativeFilter.getRecommendations(movie);
  }
}
