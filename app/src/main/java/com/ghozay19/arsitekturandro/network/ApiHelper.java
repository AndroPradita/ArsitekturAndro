package com.ghozay19.arsitekturandro.network;


public interface ApiHelper {
    Observable<MovieResponse> getPopularMovies(int page);
    Observable<MovieResponse> getTopRatedMovies(int page);
}