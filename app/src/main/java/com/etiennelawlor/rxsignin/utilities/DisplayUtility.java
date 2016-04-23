package com.etiennelawlor.rxsignin.utilities;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by etiennelawlor on 12/19/15.
 */
public class DisplayUtility {

    // region Utility Methods
    public static void hideKeyboard(Context context, View view) {
        if (context != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            if (inputMethodManager != null) {
                if (view != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        }
    }
    // endregion
}
