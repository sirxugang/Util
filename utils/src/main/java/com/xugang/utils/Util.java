package com.xugang.utils;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.text.DecimalFormat;

/**
 * Created by ASUS on 2016-11-20.
 */
public class Util {
    /**
     * 关闭键盘
     *
     * @param activity Activity
     */
    public static void hideSoftInput(Activity activity) {
        if (activity.getCurrentFocus() != null)
            ((InputMethodManager) activity
                    .getSystemService(Context.INPUT_METHOD_SERVICE))
                    .hideSoftInputFromWindow(activity.getCurrentFocus()
                            .getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }

    /**
     * 打卡软键盘
     *
     * @param editText 输入框
     * @param mContext  上下文
     */
    public static void openSoftInput(EditText editText, Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(editText, InputMethodManager.RESULT_SHOWN);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

    /**
     * 指定小数输出
     *
     * @param s      输入
     * @param format 小数格式，比如保留两位0.00
     * @return 输出结果
     */
    public static String decimalFormat(String s, String format) {
        DecimalFormat decimalFormat = new DecimalFormat(format);
        return decimalFormat.format(s);
    }

}
