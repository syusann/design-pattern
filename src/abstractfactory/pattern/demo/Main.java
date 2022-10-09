package abstractfactory.pattern.demo;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Abstract Factory Pattern Demo ***");

		ActionMovieFactory actionMovieFactory = new ActionMovieFactory();
		ITollywoodMovie tActionMovie = actionMovieFactory.getTollywoodMovie();
		IBollywoodMovie bActionMovie = actionMovieFactory.getBollywoodMovie();

		System.out.println("Action movie :");
		System.out.println(tActionMovie.getMovieName());
		System.out.println(bActionMovie.getMovieName());

		ComedyMovieFactory comedyMovieFactory = new ComedyMovieFactory();
		ITollywoodMovie tComedyMovie = comedyMovieFactory.getTollywoodMovie();
		IBollywoodMovie bComedyMovie = comedyMovieFactory.getBollywoodMovie();

		System.out.println("Comedy movie :");
		System.out.println(tComedyMovie.getMovieName());
		System.out.println(bComedyMovie.getMovieName());

	}

}
