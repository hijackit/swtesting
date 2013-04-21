package it.units.inginf.movies;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

public class MovieLister {
	//	@Inject
	MovieFinder finder;

	public MovieLister() {
		finder = new FileBasedMovieFinder("/movies.txt");
	}

	//	public MovieLister(MovieFinder finder){
	//		this.finder = finder;
	//	}

	public Movie[] moviesDirectedBy(String arg) {
		List<Movie> allMovies = finder.findAll();
		List<Movie> filtered = new ArrayList<Movie>();

		for (Movie movie : allMovies) {
			if (movie.getDirector().equalsIgnoreCase(arg))
				filtered.add(movie);
		}

		return filtered.toArray(new Movie[] {});
	}
}
