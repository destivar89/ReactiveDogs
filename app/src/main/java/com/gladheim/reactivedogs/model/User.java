package com.gladheim.reactivedogs.model;

import android.provider.ContactsContract;

/**
 * Created by David on 30/12/15.
 */
public class User {

    private String name;
    private String surname;
    private Email email;
    private Phone phone;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Email getEmail() {
        return email;
    }

    public Phone getPhone() {
        return phone;
    }

}
