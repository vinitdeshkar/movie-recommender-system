package io.vinit.spring.basics.movierecommendersystem.lesson6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
  //use filter interface to select filter
  @Autowired
  @Qualifier("CF")
  private Filter collaborativeFilter;
  public RecommenderImplementation(Filter contentBasedFilter) {
    super();
    this.collaborativeFilter = contentBasedFilter;
  }

  //use a filter to find recommendations
  public String [] recommendMovies (String movie) {
    //print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + collaborativeFilter + "\n");
    return collaborativeFilter.getRecommendations(movie);
  }
}
