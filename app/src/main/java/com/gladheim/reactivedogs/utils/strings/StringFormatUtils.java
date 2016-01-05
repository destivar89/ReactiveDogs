package com.gladheim.reactivedogs.utils.strings;

import android.content.Context;

import com.gladheim.petsapi.model.Date;
import com.gladheim.reactivedogs.R;
import com.gladheim.reactivedogs.model.PetType;

/**
 * Created by David on 31/12/15.
 */
public class StringFormatUtils {

    public String cardTitleWithDate(Context context, String petType, Date date){
        return petType + " " + context.getString(R.string.found_date) + date.toString();
    }

}
