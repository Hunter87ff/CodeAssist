package com.tyron.common;

import android.content.Context;

import androidx.annotation.NonNull;

/**
 * Utility class to retrieve the application context from anywhere.
 */
public class ApplicationProvider {

    private static Context sApplicationContext;

    public static Context initialize(@NonNull Context context) {
        return context.getApplicationContext();
    }

    public static Context getApplicationContext() {
        if (sApplicationContext == null) {
            throw new IllegalStateException("initialize() has not been called yet.");
        }
        return sApplicationContext;
    }
}
