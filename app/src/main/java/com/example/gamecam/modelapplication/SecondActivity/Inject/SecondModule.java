package com.example.gamecam.modelapplication.SecondActivity.Inject;

import android.content.Context;

import com.example.gamecam.modelapplication.DaggerCore.ApplicationScope;
import com.example.gamecam.modelapplication.SecondActivity.UI.SecondPresenter;
import com.example.gamecam.modelapplication.StartActivity.UI.StartPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gamecam on 14.2.2018.
 */

@Module
public class SecondModule {

    private Context context;

    public SecondModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    SecondPresenter getPresenter() {
        return new SecondPresenter (context);
    }
}