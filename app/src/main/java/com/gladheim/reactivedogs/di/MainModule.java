package com.gladheim.reactivedogs.di;

import android.content.Context;

import com.gladheim.petsapi.PetsApi;
import com.gladheim.retrofitpetsapi.RetrofitPetsApi;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by David on 30/12/15.
 */

@Module
public class MainModule {

    private DaggerApplication application;

    PetsApi petsApi;

    public MainModule(DaggerApplication application) {
        this.application = application;

        petsApi = new RetrofitPetsApi();
    }

    @Provides
    PetsApi providePetsApi(){
        return petsApi;
    }

    @Provides
    @Named("applicationContext")
    Context provideApplicationContext(){
        return application.getApplicationContext();
    }
}
