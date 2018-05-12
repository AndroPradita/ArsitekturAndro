package com.ghozay19.arsitekturandro.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by DMNaufal on 12/05/2018.
 */

public interface MvpView {
    void showLoading();

    void hideLoading();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();
}
