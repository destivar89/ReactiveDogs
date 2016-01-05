package com.gladheim.petsapi;

import com.gladheim.petsapi.model.Pet;
import com.gladheim.petsapi.model.PetFilter;
import com.gladheim.petsapi.model.Pets;

import rx.Observable;

/**
 * Created by David on 30/12/15.
 */
public interface PetsApi {

    public Observable<Pets> getPets(PetFilter filter);
    public Call<Void> addPet(Pet pet);
    public Call<Void> deletePet(Pet pet);

}
