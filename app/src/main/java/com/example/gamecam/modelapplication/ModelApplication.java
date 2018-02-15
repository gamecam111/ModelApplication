package com.example.gamecam.modelapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.gamecam.modelapplication.DaggerCore.AppComponent;
import com.example.gamecam.modelapplication.DaggerCore.AppModule;
import com.example.gamecam.modelapplication.DaggerCore.ApplicationCore;
import com.example.gamecam.modelapplication.DaggerCore.DaggerAppComponent;

/**
 * Created by gamecam on 14.2.2018.
 */

public class ModelApplication extends ApplicationCore<AppComponent> {
    private SharedPreferences sharedpreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedpreferences = getSharedPreferences("app_prefs", Context.MODE_PRIVATE);
        new DefaultPrefs(sharedpreferences);

    }

    public AppComponent initAppComponents() {
        return DaggerAppComponent
                .builder()
                .appModule(new AppModule(this)).build();
    }

    public static ModelApplication get(Context context) {
        return (ModelApplication) context.getApplicationContext();
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);

    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }

}

