package kodewala.day42.netflix;

import java.io.Serializable;

public class Movie implements Serializable{

	private static final long serialVersionUID = 1L;
	private String movieId;
	private String movieName;
	private float duration;
	private float watchDuration;
	public Movie(String movieId, String movieName, float duration, float watchDuration) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.duration = duration;
		this.watchDuration = watchDuration;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public float getWatchDuration() {
		return watchDuration;
	}
	public void setWatchDuration(float watchDuration) {
		this.watchDuration = watchDuration;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", duration=" + duration + ", watchDuration="
				+ watchDuration + "]";
	}
	
	
	

}
