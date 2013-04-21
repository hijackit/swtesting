package it.units.inginf.movies;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileBasedMovieFinder implements MovieFinder {

	File moviesFile;

	public FileBasedMovieFinder(String filename) {
		moviesFile = getFile(filename);
	}

	public List<Movie> findAll() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		try {
			List<String> lines = FileUtils.readLines(moviesFile);
			for (String line : lines) {
				String[] fields = line.split(";");
				Movie movie = new Movie(fields[0], fields[1]);
				movies.add(movie);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return movies;
	}

	private File getFile(String filename) {
		File file = null;
		try {
			file = new File(getClass().getResource(filename).toURI());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return file;
	}
}
