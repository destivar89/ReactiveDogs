package com.gladheim.reactivedogs.model;

import com.gladheim.reactivedogs.exception.WrongEmailFormatException;

import org.apache.commons.validator.routines.EmailValidator;


/**
 * Created by David on 30/12/15.
 */
public class Email {

    private String emailAddress;

    public Email(String emailAddress) throws WrongEmailFormatException{

        if (emailAddressIsWrong(emailAddress)) throw new WrongEmailFormatException();
        this.emailAddress = emailAddress;

    }

    public String getEmailAddress() {
        return emailAddress;
    }

    private boolean emailAddressIsWrong(String emailAddress) {
        return EmailValidator.getInstance().isValid(emailAddress);
    }
}
