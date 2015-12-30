package com.gladheim.petsapi;

/**
 * Created by David on 30/12/15.
 */
public interface Call<T> {

    T execute();
    void enqueue(Callback<T> callback);
}
