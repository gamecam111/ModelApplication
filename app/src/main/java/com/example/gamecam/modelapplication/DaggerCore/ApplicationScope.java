package com.example.gamecam.modelapplication.DaggerCore;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by gamecam on 14.2.2018.
 */

@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface ApplicationScope {
}