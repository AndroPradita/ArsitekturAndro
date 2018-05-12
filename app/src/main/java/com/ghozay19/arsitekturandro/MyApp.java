package com.ghozay19.arsitekturandro;

import android.app.Application;

import com.ghozay19.arsitekturandro.data.DataManager;
import com.ghozay19.arsitekturandro.di.component.ApplicationComponent;
import com.ghozay19.arsitekturandro.di.module.ApplicationModule;

import javax.inject.Inject;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MyApp extends Application {
    @Inject
    DataManager mDataManager;

    //    @Inject
//    CalligraphyConfig mCalligraphyConfig;
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
//
        CalligraphyConfig.initDefault(mCalligraphyConfig);
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    public void setApplicationComponent(ApplicationComponent mApplicationComponent) {
        this.mApplicationComponent = mApplicationComponent;
    }

}

