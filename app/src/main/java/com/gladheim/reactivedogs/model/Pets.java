package com.gladheim.reactivedogs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 30/12/15.
 */
public class Pets {

    private List<Pet> dogsList = new ArrayList<>();

    public Pet get(int index){
        return dogsList.get(index);
    }

    public int size(){
        return dogsList.size();
    }

    public void add(Pet pet){
        dogsList.add(pet);
    }
}
