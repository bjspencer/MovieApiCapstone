package com.movieapi.MovieAPICapstone.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

	@JsonProperty("page")
	private String page;
	@JsonProperty("result")
	private Integer result;
	@JsonProperty("total_result")
	private Integer totalResult;
	@JsonProperty("total_pages")
	private Integer totalPages;
	private ArrayList<Movie> results;

	public Result() {

	}

	public Result(String page, Integer result, Integer totalResult, Integer totalPages) {
		super();
		this.page = page;
		this.result = result;
		this.totalResult = totalResult;
		this.totalPages = totalPages;
		this.result = result;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public Integer getTotalResult() {
		return totalResult;
	}

	public void setTotalResult(Integer totalResult) {
		this.totalResult = totalResult;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	
	public ArrayList<Movie> getResults() {
		return results;
	}

	public void setResults(ArrayList<Movie> results) {
		this.results = results;
	}
	

	@Override
	public String toString() {
		return "Result [page=" + page + ", result=" + result + ", totalResult=" + totalResult + ", totalPages="
				+ totalPages + "]";
	}

}
