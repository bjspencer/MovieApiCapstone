package com.movieapi.MovieAPICapstone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fav_movie")
public class FavMovie {

	@Id
	private Long id;
	private String title;
	private Boolean video;
	private String overview;
	private String releasedate;

	public FavMovie() {

	}

	public FavMovie(Long id, String title, Boolean video, String overview, String releasedate) {
		this.id = id;
		this.title = title;
		this.video = video;
		this.overview = overview;
		this.releasedate = releasedate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	@Override
	public String toString() {
		return "FavMovie [id=" + id + ", title=" + title + ", video=" + video + ", overview=" + overview
				+ ", releaseDate=" + releasedate + "]";
	}

}
