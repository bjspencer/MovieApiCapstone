package com.movieapi.MovieAPICapstone;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieapi.MovieAPICapstone.entity.FavMovie;

public interface FavMovieRepository extends JpaRepository<FavMovie, Long> {

}
