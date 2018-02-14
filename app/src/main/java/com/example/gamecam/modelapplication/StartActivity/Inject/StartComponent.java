package com.example.gamecam.modelapplication.StartActivity.Inject;

import com.example.gamecam.modelapplication.DaggerCore.ApplicationScope;
import com.example.gamecam.modelapplication.StartActivity.UI.StartActivity;

import dagger.Subcomponent;

/**
 * Created by gamecam on 14.2.2018.
 */

@ApplicationScope
@Subcomponent(
        modules = {StartModule.class}
)

public interface StartComponent {
    void inject(StartActivity activity);
}