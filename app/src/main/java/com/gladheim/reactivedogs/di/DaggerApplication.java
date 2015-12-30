package com.gladheim.reactivedogs.di;

import android.app.Application;

/**
 * Created by David on 30/12/15.
 */
public class DaggerApplication extends Application{

    private RootComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeDependencyInjector();
    }

    private void initializeDependencyInjector() {
        component = DaggerRootComponent.builder()
                .mainModule(new MainModule(this))
                .build();
        component.inject(this);

    }

    public RootComponent getComponent() {
        return component;
    }

}
