package com.gladheim.reactivedogs.ui.presenter.impl;

import android.content.Context;

import com.gladheim.reactivedogs.di.DaggerApplication;
import com.gladheim.reactivedogs.ui.presenter.SearchPresenter;

/**
 * Created by David on 30/12/15.
 */
public class SearchPresenterImpl extends SearchPresenter{

    private Context context;

    public SearchPresenterImpl(Context context) {

        this.context = context;

        ((DaggerApplication)context.getApplicationContext())
                .getComponent().inject(this); // This line provides injected fields declared in SearchPresenter.java

    }

    @Override
    public void initialize() {
        petsApi.getPets(null);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }
}
