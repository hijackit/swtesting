package it.units.inginf.movies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import it.units.inginf.movies.Movie;
import it.units.inginf.movies.OnlineMovieFinder;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

public class OnlineMovieFinderTest {

	OnlineMovieFinder finder;
	Server server;

	@Before
	public void setUp() throws Exception {
		finder = new OnlineMovieFinder("http://127.0.0.1:8980/moviesdb");

		server = new Server(8980);
		Context context = new Context(server, "/", Context.SESSIONS);
		
		Servlet servlet = new StubServlet(new ServletCallback() {
			public void process(PrintWriter writer) {
				writer.write("martin scorsese;the good fellas\n");
				writer.write("martin scorsese;taxi driver\n");
				writer.write("martin scorsese;shutter island\n");
				writer.write("michael bay;armageddon\n");
				writer.write("michael bay;transformers\n");
			}
		});
		context.addServlet(new ServletHolder(servlet), "/moviesdb");
		server.start();
	}

	@After
	public void tearDown() throws Exception {
		if (server != null)
			server.stop();
	}

	@Test
	public void shouldFindAllMovies() throws Exception {
		List<Movie> movies = finder.findAll();
		assertNotNull(movies);
		assertEquals(5, movies.size());
	}
}
