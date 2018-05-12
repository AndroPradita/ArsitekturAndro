package com.ghozay19.arsitekturandro.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import com.ghozay19.arsitekturandro.di.ActivityContext;
import com.ghozay19.arsitekturandro.utils.rx.AppSchedulerProvider;
import com.ghozay19.arsitekturandro.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule {
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity context) {
        return new LinearLayoutManager(context);
    }

    @Provides
    GridLayoutManager provideGridLayoutManager(AppCompatActivity context) {
        return new GridLayoutManager(context, 2);
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();

    }

    @Provides
    SchedulerProvider provideScheduleProvider(){
        return new AppSchedulerProvider();
    }
}