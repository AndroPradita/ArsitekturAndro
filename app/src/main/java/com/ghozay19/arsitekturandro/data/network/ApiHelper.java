package com.ghozay19.arsitekturandro.data.network;


import android.database.Observable;

import com.ghozay19.arsitekturandro.data.network.model.MovieResponse;

public interface ApiHelper {
    Observable<MovieResponse> getPopularMovies(int page);
    Observable<MovieResponse> getTopRatedMovies(int page);
}