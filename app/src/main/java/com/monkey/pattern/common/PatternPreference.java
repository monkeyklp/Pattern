package com.monkey.pattern.common;

import android.content.Context;
import android.support.annotation.NonNull;

import com.monkey.common.preferences.BasePreference;

/**
 * Created by klp13115 on 2017/10/20.
 */

public class PatternPreference extends BasePreference {

    protected static PatternPreference preferences;

    public PatternPreference(Context context) {
        super(context);
    }

    protected static BasePreference getPreferences(@NonNull Context context){
        if (preferences == null) {
            preferences = new PatternPreference(context);
        }
        return preferences;
    }

    public static final String TEST_KEY = "test";
    public static String getTestString(Context context, String defaultValue) {
        return getPreferences(context).getString(TEST_KEY, defaultValue);
    }
    public static void putTestString(Context context, String value) {
        getPreferences(context).putString(TEST_KEY, value);
    }
}
