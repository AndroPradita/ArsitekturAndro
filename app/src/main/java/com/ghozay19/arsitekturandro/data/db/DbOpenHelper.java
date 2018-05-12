package com.ghozay19.arsitekturandro.data.db;

import android.content.Context;

import com.ghozay19.arsitekturandro.data.db.model.DaoMaster;
import com.ghozay19.arsitekturandro.di.ApplicationContext;
import com.ghozay19.arsitekturandro.di.DatabaseInfo;

import javax.inject.Inject;
import javax.inject.Singleton;
//
//@Singleton
//public class DbOpenHelper {
    @Singleton
    public class DbOpenHelper extends DaoMaster.OpenHelper {
    @Inject
    public DbOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }

}