package com.zkh.util;

import android.content.Context;

/**
 * Created by zhaokaihang on 2024/3/13
 */
public class UtilsContext {

    private static Context mContext;

    public static void init(Context c) {
        mContext = c;
    }

    public static Context getContext() {
        return mContext;
    }
}

