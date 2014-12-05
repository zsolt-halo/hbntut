package com.zsolt.hbntutorial;

import java.util.Date;

public class DataProvider {

	private int movieID;
	private String title;
	private Date releaseDate;
	
	public int getMovieID() {
		return movieID;
	}
	public String getTitle() {
		return title;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
}
