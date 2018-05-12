package com.ghozay19.arsitekturandro.data.network;




import com.ghozay19.arsitekturandro.data.network.model.MovieResponse;

import io.reactivex.Observable;

public interface ApiHelper {
    Observable<MovieResponse> getPopularMovies(int page);
    Observable<MovieResponse> getTopRatedMovies(int page);
}