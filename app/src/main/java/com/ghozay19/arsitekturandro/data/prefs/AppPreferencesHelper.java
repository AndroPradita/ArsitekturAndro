package com.ghozay19.arsitekturandro.data.prefs;

import com.ghozay19.arsitekturandro.di.ApplicationContext;
import com.ghozay19.arsitekturandro.di.Preferenceinfo;

import android.content.Context;
import android.content.SharedPreferences;

//import com.raycoding.popularmoviemvp.di.ApplicationContext;
//import com.raycoding.popularmoviemvp.di.PreferenceInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by ray <rizkirayraynaldy@gmail.com> on 03/05/18.
 */

@Singleton
public class AppPreferencesHelper implements PreferencesHelper{
    private SharedPreferences mPrefs;

    @Inject
    AppPreferencesHelper(@ApplicationContext Context context, @PreferenceInfo String prefName){
        mPrefs = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
    }
}