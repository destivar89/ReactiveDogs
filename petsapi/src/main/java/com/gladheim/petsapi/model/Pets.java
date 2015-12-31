package com.gladheim.petsapi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 30/12/15.
 */
public class Pets {

    private List<Pet> results = new ArrayList<>();

    public Pet get(int index){
        return results.get(index);
    }

    public int size(){
        return results.size();
    }

    public void add(Pet pet){
        results.add(pet);
    }

    public void addAll(List<Pet> pets){
        results.addAll(pets);
    }

    public List<Pet> getResults() {
        return results;
    }
}
