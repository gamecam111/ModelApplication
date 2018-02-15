package com.example.gamecam.modelapplication.StartActivity.Inject;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.gamecam.modelapplication.DaggerCore.ApplicationScope;
import com.example.gamecam.modelapplication.StartActivity.UI.StartPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gamecam on 14.2.2018.
 */

@Module
public class StartModule {

    private Context mContext;

    public StartModule(Context context) {
        this.mContext = context;
    }

    @Provides
    @ApplicationScope
    StartPresenter getPresenter(SharedPreferences prefs) {
        return new StartPresenter(mContext, prefs);
    }
}
