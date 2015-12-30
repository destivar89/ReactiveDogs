package com.gladheim.reactivedogs.di;

import android.content.Context;

import com.gladheim.reactivedogs.ui.adapter.SearchAdapter;
import com.gladheim.reactivedogs.ui.presenter.SearchPresenter;
import com.gladheim.reactivedogs.ui.presenter.impl.SearchPresenterImpl;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Created by David on 30/12/15.
 */
@Module
public class SearchModule {

    SearchAdapter adapter;
    private final Context context;

    public SearchModule(final Context context, SearchAdapter.OnItemClickListener listener) {
        this.context = context;
        adapter = new SearchAdapter(context);
        adapter.setOnItemClickListener(listener);
    }

    @Provides
    SearchPresenter provideUserListPresenter(){
        return new SearchPresenterImpl(context);
    }

    @Provides
    SearchAdapter provideSearchAdapter(){
        return adapter;
    }
}
