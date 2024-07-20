package io.vinit.spring.basics.movierecommendersystem.lesson1;

import io.vinit.spring.basics.movierecommendersystem.lesson2.Filter;

public class RecommenderImplementation {


  public String [] recommendMovies (String movie) {
    //use content based filter to find similar movies
    ContentBasedFilter filter = new ContentBasedFilter();
    //return the results
    //return new String[] {"M1", "M2", "M3"};
    return filter.getRecommendations(movie);
  }
}
