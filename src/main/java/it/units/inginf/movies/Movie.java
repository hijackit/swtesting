package it.units.inginf.movies;

public class Movie {

	String title;
	String director;

	public Movie(String director, String title) {
		this.director = director;
		this.title = title;
	}

	public String getDirector() {
		return director;
	}
	public String getTitle() {
		return title;
	}
}
