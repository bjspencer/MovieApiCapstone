package com.movieapi.MovieAPICapstone;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.movieapi.MovieAPICapstone.entity.FavMovie;
import com.movieapi.MovieAPICapstone.entity.Movie;
import com.movieapi.MovieAPICapstone.entity.Result;

@Controller
public class MovieController {

	@Autowired
	FavMovieRepository favMovieRepo;

	@GetMapping("/")
	public ModelAndView indexPage() {

		return new ModelAndView("index");
	}

	@RequestMapping("/results")
	public ModelAndView resultPage(@RequestParam("keyword") String keyword) {
		RestTemplate restTemplate = new RestTemplate();
		Result result = restTemplate.getForObject(
				"https://api.themoviedb.org/3/search/movie?api_key=a078d5a5405632e5a134e3096e7c56da&query=" + keyword,
				Result.class);
		ArrayList<Movie> results = result.getResults();

		return new ModelAndView("result", "movie", results);
	}

	@RequestMapping("/add/{id}/{title}/{video}/{overview}/{release_date}/")
	public ModelAndView addMovie(@PathVariable("id") Long id, @PathVariable("title") String title,
			@PathVariable("video") Boolean video, @PathVariable("overview") String overview,
			@PathVariable("release_date") String rd) {

		FavMovie favMovie = new FavMovie(id, title, video, overview, rd);
		favMovieRepo.save(favMovie);
		System.out.println(favMovie.toString());
		return new ModelAndView("redirect:/");

	}

	@RequestMapping("/favorites")
	public ModelAndView viewFaves() {
		return new ModelAndView("faves", "movies", favMovieRepo.findAll());
	}

	@RequestMapping("{id}/delete")
	public ModelAndView deleteFromFaves(@PathVariable("id") Long id) {
		favMovieRepo.deleteById(id);
		return new ModelAndView("redirect:/favorites");
	}
}
