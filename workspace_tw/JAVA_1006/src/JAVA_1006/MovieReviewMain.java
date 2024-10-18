package JAVA_1006;

public class MovieReviewMain {

	public static void main(String[] args) {
		
		MovieReview movie = new MovieReview();
		
		movie.MovieTitle = "조커";
		movie.Review = "심오하다";
		
		System.out.println("영화제목 : " + movie.MovieTitle + " 영화리뷰 : " + movie.Review);
		System.out.println("");
		
		//---------------------------------
		
		MovieReview movie1 = new MovieReview();
		MovieReview movie2 = new MovieReview();
		MovieReview movie3 = new MovieReview();
		
		MovieReview[] movies = new MovieReview[] {movie1, movie2, movie3};
		
		movies[0].MovieTitle = "하이재킹";
		movies[1].MovieTitle = "베테랑2";
		movies[2].MovieTitle = "늘봄가든";
		
		movies[0].Review = "스릴넘친다";
		movies[1].Review = "잔인하다";
		movies[2].Review = "무섭다";
		
		for(int i = 0; i < movies.length; i++)
		{
			System.out.printf("영화제목 : %s\n", movies[i].MovieTitle);
			System.out.printf("영화리뷰 : %s\n", movies[i].Review);
			System.out.println("");
		
		}
	}
}
