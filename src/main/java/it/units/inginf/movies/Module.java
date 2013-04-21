package it.units.inginf.movies;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule {

	@Override
	protected void configure() {
		bind(MovieFinder.class).toInstance(new FileBasedMovieFinder("/movies.txt"));
	}
}
