package com.ghozay19.arsitekturandro.di.component;

import com.ghozay19.arsitekturandro.MyApp;
import com.ghozay19.arsitekturandro.data.DataManager;
import com.ghozay19.arsitekturandro.di.ApplicationContext;
import com.ghozay19.arsitekturandro.di.module.ApplicationModule;
import android.app.Application;
import android.content.Context;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ray <rizkirayraynaldy@gmail.com> on 03/05/18.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}