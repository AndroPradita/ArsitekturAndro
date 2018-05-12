package com.ghozay19.arsitekturandro.ui.base;

/**
 * Created by DMNaufal on 12/05/2018.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);
    void onDetach();
}
