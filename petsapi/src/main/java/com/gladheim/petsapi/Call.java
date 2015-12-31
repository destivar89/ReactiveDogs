package com.gladheim.petsapi;

/**
 * Created by David on 30/12/15.
 */
public abstract class Call<T> {

    public abstract T execute();
    public abstract void enqueue(Callback<T> callback);

}
