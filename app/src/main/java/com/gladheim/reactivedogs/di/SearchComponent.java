package com.gladheim.reactivedogs.di;

import com.gladheim.reactivedogs.ui.activity.SearchActivity;

import dagger.Component;

/**
 * Created by David on 30/12/15.
 */
@PerActivity @Component(dependencies = RootComponent.class, modules = SearchModule.class)
public interface SearchComponent {
    void inject(SearchActivity activity);
}
