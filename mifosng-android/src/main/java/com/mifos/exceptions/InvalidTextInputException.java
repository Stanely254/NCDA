/*
 * This project is licensed under the open source MPL V2.
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */

package com.mifos.exceptions;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class InvalidTextInputException extends Exception {
    public static final String TYPE_ALPHABETS = "Alphabets";
    private final String fieldInput;
    private final String localisedErrorMessage;
    private final String inputType;

    public InvalidTextInputException(String fieldInput, String localisedErrorMessage, String
            inputType) {
        this.fieldInput = fieldInput;
        this.localisedErrorMessage = localisedErrorMessage;
        this.inputType = inputType;
    }

    @NonNull
    @Override
    public String toString() {
        return fieldInput + " " + localisedErrorMessage + " " + inputType;
    }


    public void notifyUserWithToast(Context context) {
        Toast.makeText(context, toString(), Toast.LENGTH_SHORT).show();
    }
}
