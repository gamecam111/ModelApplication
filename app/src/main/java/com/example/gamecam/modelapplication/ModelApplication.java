package com.example.gamecam.modelapplication;

import android.app.Application;
import android.content.Context;

import com.example.gamecam.modelapplication.DaggerCore.AppComponent;
import com.example.gamecam.modelapplication.DaggerCore.AppModule;
import com.example.gamecam.modelapplication.DaggerCore.ApplicationCore;
import com.example.gamecam.modelapplication.DaggerCore.DaggerAppComponent;

/**
 * Created by gamecam on 14.2.2018.
 */

public class ModelApplication extends ApplicationCore<AppComponent> {

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public AppComponent initAppComponents() {
        return DaggerAppComponent
                .builder()
                .appModule(new AppModule(this)).build();
    }

    public static ModelApplication get(Context context) {
        return (ModelApplication) context.getApplicationContext();
    }
}

