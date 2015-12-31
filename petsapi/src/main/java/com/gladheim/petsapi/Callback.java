package com.gladheim.petsapi;

/**
 * Created by David on 30/12/15.
 */
public abstract class Callback<T> {

    public abstract void onResponse(T response);
    public abstract void onFailure(Exception e);

}
