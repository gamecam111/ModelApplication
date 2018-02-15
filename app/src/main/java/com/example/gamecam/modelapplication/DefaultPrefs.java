package com.example.gamecam.modelapplication;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by gamecam on 15.2.2018.
 */

public class DefaultPrefs {


    public DefaultPrefs(SharedPreferences sharedPreferences) {

        SharedPreferences.Editor editor = sharedPreferences.edit();

        //Keys iniciate
        editor.putString("default", "default");
        editor.putString("1", "jedna");
        editor.putString("2", "dva");
        editor.putString("3", "tri");
        editor.putString("4", "styry");
        editor.putString("5", "pet");

        //Commit
        editor.commit();
    }
}
