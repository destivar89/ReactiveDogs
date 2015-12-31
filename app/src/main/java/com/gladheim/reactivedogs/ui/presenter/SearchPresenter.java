package com.gladheim.reactivedogs.ui.presenter;

import com.gladheim.petsapi.PetsApi;
import com.gladheim.petsapi.model.Pets;

import javax.inject.Inject;

/**
 * Created by David on 30/12/15.
 */
public abstract class SearchPresenter extends Presenter<SearchPresenter.View> {

    @Inject
    protected PetsApi petsApi;

    public interface View {
        void showPetList(Pets pets);
    }
}
