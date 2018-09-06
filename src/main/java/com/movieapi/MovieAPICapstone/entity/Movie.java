package com.movieapi.MovieAPICapstone.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Movie {

	
	
	private String title;
	private Boolean video;
	private String overview;
	private String release_date;
	private int id;
	
	public Movie() {
		
	}

//	public Movie(String title, Boolean video, String overview, String releasedate, int id) {
//		this.title = title;
//		this.video = video;
//		this.overview = overview;
//		this.releasedate = releasedate;
//		this.id = id;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getVideo() {
		return video;
	}

	public void setVideo(Boolean video) {
		this.video = video;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", video=" + video + ", overview=" + overview + ", releaseDate=" + release_date
				+ "]";
	}
	
	
}
