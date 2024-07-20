package io.vinit.spring.basics.movierecommendersystem.lesson15;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

  @Value("${recommender.implementation.favoriteMovie: Finding Dory}")
  String favoriteMovie = "Finding Dory";

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

  public String getFavoriteMovie() {
    return favoriteMovie;
  }
}
