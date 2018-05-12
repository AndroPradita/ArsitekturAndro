package com.ghozay19.arsitekturandro.network;


import com.rx2androidnetworking.Rx2AndroidNetworking;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppApiHelper implements ApiHelper {
    private static final String TAG = "AppApiHelper";

    @Inject
    AppApiHelper() {
    }

    @Override
    public Observable<MovieResponse> getPopularMovies(int page) {
        return Rx2AndroidNetworking.get(ApiEndpoint.getPopularMovieUrl(page))
                .build()
                .getObjectObservable(MovieResponse.class);
    }

    @Override
    public Observable<MovieResponse> getTopRatedMovies(int page) {
        return Rx2AndroidNetworking.get(ApiEndpoint.getTopRatedMovieUrl(page))
                .build()
                .getObjectObservable(MovieResponse.class);
    }
}