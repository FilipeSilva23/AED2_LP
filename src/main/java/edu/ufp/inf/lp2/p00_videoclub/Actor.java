package edu.ufp.inf.lp2.p00_videoclub;
import java.util.ArrayList;
import java.util.List;


public class Actor {

  private String name;
  private List<Movie> movies;

  public Actor(String name) {
    this.name = name;
    this.movies = new ArrayList<>();

  }
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name=name;
  }

  public Movie addMovie(Movie m) {
    this.movies.add(m);
  return m;
  }

  public Movie deleteMovie(Movie m) {
    this.movies.remove(m);
    return m;
  }


  public ArrayList<Actor> listActors() {
    return new ArrayList<>() ;
  }


}