package com.gladheim.reactivedogs.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gladheim.reactivedogs.R;
import com.gladheim.reactivedogs.di.DaggerApplication;
import com.gladheim.reactivedogs.di.DaggerSearchComponent;
import com.gladheim.reactivedogs.di.SearchComponent;
import com.gladheim.reactivedogs.di.SearchModule;
import com.gladheim.reactivedogs.ui.adapter.SearchAdapter;
import com.gladheim.reactivedogs.ui.presenter.SearchPresenter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements SearchAdapter.OnItemClickListener, SearchPresenter.View {

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;

    @Inject
    SearchAdapter adapter;

    @Inject
    SearchPresenter presenter;

    private SearchComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        component().inject(this);
        ButterKnife.bind(this);

        presenter.setView(this);
        presenter.initialize();

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private SearchComponent component(){
        if(component == null){
            component = DaggerSearchComponent.builder()
                    .rootComponent(((DaggerApplication) getApplication()).getComponent())
                    .searchModule(new SearchModule(getApplicationContext(), this))
                    .build();
        }
        return component;
    }

    @Override
    public void onItemClick(View v, int position) {

    }
}
