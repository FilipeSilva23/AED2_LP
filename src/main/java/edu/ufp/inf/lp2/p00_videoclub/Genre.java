package edu.ufp.inf.lp2.p00_videoclub;

import java.util.ArrayList;
import java.util.List;

public class Genre {

  private String genre;
  private List<Movie> movies;

  // Construtor
  public Genre(String genre) {
    this.genre = genre;
    this.movies = new ArrayList<>();
  }

  // Getter
  public String getGenre() {
    return this.genre;
  }

  // Setter

  // Adicionar filme ao género
  public Movie addMovie(Movie m) {
    if (m != null && !movies.contains(m)) {
      movies.add(m);
    }
    return m;
  }

  // Remover filme do género
  public Movie deleteMovie(Movie m) {
    if (m != null && movies.contains(m)) {
      movies.remove(m);
    }
    return m;
  }

  // Listar filmes do género
  public List<Movie> listMovies() {
    return this.movies;
  }
}
