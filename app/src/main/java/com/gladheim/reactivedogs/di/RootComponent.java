/**
 * Created by David on 30/12/15.
 */
package com.gladheim.reactivedogs.di;

import com.gladheim.reactivedogs.ui.activity.BaseActivity;
import com.gladheim.reactivedogs.ui.presenter.SearchPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MainModule.class)
public interface RootComponent {

    void inject(BaseActivity activity); // BaseActivity can inject dependencies from this Component
    void inject(DaggerApplication application);

    void inject(SearchPresenter presenter); // SearchPresenter can inject dependencies from this Component
}