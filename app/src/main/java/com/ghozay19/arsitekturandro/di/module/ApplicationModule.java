package com.ghozay19.arsitekturandro.di.module;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.ghozay19.arsitekturandro.data.db.AppDbHelper;
import com.ghozay19.arsitekturandro.data.db.DbHelper;
import com.ghozay19.arsitekturandro.di.ApplicationContext;
import com.ghozay19.arsitekturandro.di.DatabaseInfo;
import com.ghozay19.arsitekturandro.di.Preferenceinfo;
import com.ghozay19.arsitekturandro.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName(){ return AppConstants.DB_NAME;}

    @Provides
    @Preferenceinfo
    String providePrefName(){return AppConstants.PREF_NAME;}

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }
}