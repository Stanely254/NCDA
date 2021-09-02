/*
 * This project is licensed under the open source MPL V2.
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */

package com.mifos.exceptions;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class ShortOfLengthException extends Exception {

    private int minimumCharacters;
    private String inputField;

    public ShortOfLengthException(String inputField, int minimumCharacters) {
        super();
        this.minimumCharacters = minimumCharacters;
        this.inputField = inputField;
    }

    @NonNull
    @Override
    public String toString() {
        return inputField + " Field Expects at least " + minimumCharacters
                + " characters";
    }


    public void notifyUserWithToast(Context context) {
        Toast.makeText(context, toString(), Toast.LENGTH_SHORT).show();
    }

}
