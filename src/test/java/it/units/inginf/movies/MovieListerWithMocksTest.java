package it.units.inginf.movies;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MovieListerWithMocksTest {
	MovieFinder finder;
	MovieLister lister;

	@Before
	public void setUp() throws Exception {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Martin Scorsese", "Shutter Island"));
		
		finder = mock(MovieFinder.class);
		when(finder.findAll()).thenReturn(movies);
		
		lister = new MovieLister(finder);
	}

	@Ignore
	@Test
	public void test() {
		Movie[] movies = lister.moviesDirectedBy("Martin Scorsese");
		assertEquals(1, movies.length);
		verify(finder, times(1)).findAll();
	}
}
