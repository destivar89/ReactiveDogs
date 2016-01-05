package com.gladheim.reactivedogs.ui.presenter.impl;

import android.content.Context;

import com.gladheim.petsapi.Call;
import com.gladheim.petsapi.Callback;
import com.gladheim.petsapi.model.Pets;
import com.gladheim.petsapi.model.User;
import com.gladheim.reactivedogs.di.DaggerApplication;
import com.gladheim.reactivedogs.ui.presenter.SearchPresenter;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

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
        Observable<Pets> petsObservable= petsApi.getPets(null);

        petsObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Pets>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.getMessage();
                    }

                    @Override
                    public void onNext(Pets pets) {
                        view.showPetList(pets);
                    }
                });

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
