package com.ghozay19.arsitekturandro.data;

import com.ghozay19.arsitekturandro.data.db.DbHelper;
import com.ghozay19.arsitekturandro.data.network.ApiHelper;
import com.ghozay19.arsitekturandro.data.prefs.PreferencesHelper;

public interface DataManager extends DbHelper, ApiHelper, PreferencesHelper {
}
