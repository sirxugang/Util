package com.xugang.utils.massege;

import com.xugang.utils.Config;

/**
 * Created by ASUS on 2016-11-20.
 */
public class Log {
    private static final String TAG = Config.SIGN;

    public static void i(String msg) {
        android.util.Log.i(TAG, msg);
    }

    public static void i(String tag, String msg) {
        android.util.Log.i(tag, msg);
    }

    public static void d(String msg) {
        android.util.Log.d(TAG, msg);
    }

    public static void d(String tag, String msg) {
        android.util.Log.d(tag, msg);
    }

    public static void w(String msg) {
        android.util.Log.w(TAG, msg);
    }

    public static void w(String tag, String msg) {
        android.util.Log.w(tag, msg);
    }

    public static void v(String msg) {
        android.util.Log.v(TAG, msg);
    }

    public static void v(String tag, String msg) {
        android.util.Log.v(tag, msg);
    }

    public static void e(String msg) {
        android.util.Log.e(TAG, msg);
    }

    public static void e(String tag, String msg) {
        android.util.Log.e(tag, msg);
    }
}
