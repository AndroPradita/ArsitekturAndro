package com.ghozay19.arsitekturandro.di.component;

import com.ghozay19.arsitekturandro.di.PerActivity;
import com.ghozay19.arsitekturandro.di.module.ApplicationModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ApplicationModule.class)
public interface ActivityComponent {
//    void inject(MovieListActivity activity);
//
//    void inject(MovideDetailActivity activity);
}
