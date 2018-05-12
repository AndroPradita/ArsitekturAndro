package com.ghozay19.arsitekturandro.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.ghozay19.arsitekturandro.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppPreferencesHelper implements PreferencesHelper{
    private SharedPreferences mPrefs;

    @Inject
    AppPreferencesHelper(@ApplicationContext Context context, @PreferenceInfo String prefName){
        mPrefs = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
    }
}