package me.zzxb.listviewdemo;

import android.app.Activity;

/**
 * Created by zzxb on 15/11/23.
 */
public class Goals {
    public static int SCREEN_GAO = 0;
    public static int SCREEN_KUAN = 0;

    public static void init(Activity activity){
        SCREEN_GAO = activity.getWindowManager().getDefaultDisplay().getHeight();
        SCREEN_KUAN = activity.getWindowManager().getDefaultDisplay().getWidth();
    }
}
