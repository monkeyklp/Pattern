package com.monkey.common.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by klp13115 on 2017/10/20.
 */

public class BasePreference {
    protected Context mContext;

    public BasePreference(Context context) {
        this.mContext = context;
    }

    private static SharedPreferences getPreference(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public String getString(String key, String defaultValue) {
        return getPreference(mContext).getString(key, defaultValue);
    }
    public void putString(String key, String value) {
        getPreference(mContext).edit().putString(key, value).apply();
    }

    public int getInt(String key, int defaultValue) {
        return getPreference(mContext).getInt(key, defaultValue);
    }
    public void putInt(String key, int value) {
        getPreference(mContext).edit().putInt(key, value).apply();
    }

    public long getLong(String key, long defaultValue) {
        return getPreference(mContext).getLong(key, defaultValue);
    }
    public void putLong(String key, long value) {
        getPreference(mContext).edit().putLong(key, value).apply();
    }

    public float getFloat(String key, float defaultValue) {
        return getPreference(mContext).getFloat(key, defaultValue);
    }
    public void putFloat(String key, float value) {
        getPreference(mContext).edit().putFloat(key, value).apply();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return getPreference(mContext).getBoolean(key, defaultValue);
    }
    public void putBoolean(String key, boolean value) {
        getPreference(mContext).edit().putBoolean(key, value).apply();
    }
}
