package it.units.inginf.movies;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class OnlineMovieFinder implements MovieFinder {

	String address;

	public OnlineMovieFinder(String address) {
		this.address = address;
	}

	public List<Movie> findAll() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		InputStreamReader reader = null;
		try {
			URL url = new URL(address);

			URLConnection con = url.openConnection();
			reader = new InputStreamReader(con.getInputStream());

			List<String> lines = IOUtils.readLines(reader);
			for (String line : lines) {
				String[] fields = line.split(";");
				Movie movie = new Movie(fields[0], fields[1]);
				movies.add(movie);
			}
		} catch (Exception e) {
			System.err.println("Error reading from " + address);
		} finally {
			IOUtils.closeQuietly(reader);
		}

		return movies;
	}

}
