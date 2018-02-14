package com.example.gamecam.modelapplication.DaggerCore;

import com.example.gamecam.modelapplication.SecondActivity.Inject.SecondComponent;
import com.example.gamecam.modelapplication.SecondActivity.Inject.SecondModule;
import com.example.gamecam.modelapplication.StartActivity.Inject.StartComponent;
import com.example.gamecam.modelapplication.StartActivity.Inject.StartModule;

import dagger.Component;

/**
 * Created by gamecam on 14.2.2018.
 */

@ApplicationScope
@Component(modules = { AppModule.class})
public interface AppComponent {
    StartComponent plus(StartModule module);
    SecondComponent plus (SecondModule module);

}