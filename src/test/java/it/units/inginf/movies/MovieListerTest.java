package it.units.inginf.movies;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MovieListerTest {

	//	MovieFinder finder;
	MovieLister lister;

	@Before
	public void setUp() throws Exception {
		lister = new MovieLister();
		//		finder = new FileBasedMovieFinder("/movies.txt");
		//		lister = new MovieLister(finder);
	}

	@Test
	public void test() {
		Movie[] movies = lister.moviesDirectedBy("Martin Scorsese");
		//		assertEquals(??, movies.length);
		//		assertEquals(7, movies.length);
	}
}
