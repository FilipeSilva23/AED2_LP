package edu.ufp.inf.lp2.p00_videoclub;

import java.util.List;
import java.util.ArrayList;
// seria como struct em C, ou seja, um tipo de dados composto por vários campos
public class Movie {

  private String title;
  private Integer year;
  private List<Genre> genres;
  private List<Actor> actors;

  // Construtor, que é um método especial usado para criar objetos da classe Movie. Ele recebe o título e o ano do filme como parâmetros
  public Movie(String title, Integer year) {
    this.title = title;
    this.year = year;
    this.genres = new ArrayList<>();
    this.actors = new ArrayList<>();
  }

  // GETTERS e SETTERS
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  // ================= GENRES =================

  public Genre addGenre(Genre g) {
    if (g != null && !genres.contains(g)) {
      genres.add(g);
    }
    return g;
  }

  public Genre deleteGenre(Genre g) {
    if (g != null && genres.contains(g)) {
      genres.remove(g);
    }
    return g;
  }

  public List<Genre> listGenres() {
    return genres;
  }

  // ================= ACTORS =================

  public Actor addActor(Actor a) {
    if (a != null && !actors.contains(a)) {
      actors.add(a);
    }
    return a;
  }

  public Actor deleteActor(Actor a) {
    if (a != null && actors.contains(a)) {
      actors.remove(a);
    }
    return a;
  }

  public List<Actor> listActors() {
    return actors;
  }
}
