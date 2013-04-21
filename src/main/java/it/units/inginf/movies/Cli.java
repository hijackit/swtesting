package it.units.inginf.movies;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.RootLogger;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Cli {

//	MovieLister lister = new MovieLister();
	MovieLister lister;
	
	public Cli(MovieLister lister){
		this.lister = lister;
	}

	@Command
	public void list(String director) {
		Movie[] movies = lister.moviesDirectedBy(director);
		for (Movie movie : movies) {
			System.out.println(movie.getTitle());
		}
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure(new ConsoleAppender(new PatternLayout()));
		RootLogger.getRootLogger().setLevel(Level.WARN);
		RootLogger.getLogger(Cli.class).setLevel(Level.INFO);
		
//		Injector injector = Guice.createInjector(new Module());
//		MovieLister movieLister = injector.getInstance(MovieLister.class);
		
		MovieLister movieLister = new MovieLister();
		
		ShellFactory.createConsoleShell("IMDB 2.0", "IMDB On Steroids", new Cli(movieLister)).commandLoop();

		System.exit(0);
	}
}
