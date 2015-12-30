package com.gladheim.reactivedogs.model;

import com.gladheim.reactivedogs.exception.WrongPhoneFormatException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by David on 30/12/15.
 */
public class Phone {

    private String phoneNumber;

    public Phone(String phoneNumber) throws WrongPhoneFormatException{

        if (phoneNumberIsWrong(phoneNumber)) throw new WrongPhoneFormatException();
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private boolean phoneNumberIsWrong(String phoneNumber) {

        Pattern pattern = Pattern.compile("\\d{9}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
