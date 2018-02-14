package com.example.gamecam.modelapplication.DaggerCore;

import android.app.Application;

/**
 * Created by gamecam on 14.2.2018.
 */

public abstract class ApplicationCore<T> extends Application {
    private static ApplicationCore instance;
    private T component;

    protected abstract T initAppComponents();

    public static ApplicationCore getApp() {
        return instance;
    }

    public ApplicationCore() {
        instance = this;
    }

    public void onCreate() {
        super.onCreate();
        this.component = initAppComponents();
    }

    public T component() {
        return this.component;
    }
}
