package com.gladheim.petsapi;

/**
 * Created by David on 30/12/15.
 */
public interface Callback<T> {

    void onResponse(T response);
    void onFailure(Exception e);

}
