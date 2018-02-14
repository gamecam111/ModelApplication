package com.example.gamecam.modelapplication.SecondActivity.Inject;

import com.example.gamecam.modelapplication.DaggerCore.ApplicationScope;
import com.example.gamecam.modelapplication.SecondActivity.UI.SecondActivity;
import com.example.gamecam.modelapplication.StartActivity.Inject.StartModule;
import com.example.gamecam.modelapplication.StartActivity.UI.StartActivity;

import dagger.Subcomponent;

/**
 * Created by gamecam on 14.2.2018.
 */

@ApplicationScope
@Subcomponent(
        modules = {SecondModule.class}
)

public interface SecondComponent {
    void inject(SecondActivity activity);
}