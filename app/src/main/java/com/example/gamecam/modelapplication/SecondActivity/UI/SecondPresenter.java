package com.example.gamecam.modelapplication.SecondActivity.UI;

import android.content.Context;

import com.example.gamecam.modelapplication.StartActivity.UI.StartModel;

import javax.inject.Inject;

/**
 * Created by gamecam on 14.2.2018.
 */

public class SecondPresenter {
    private Context mContext;
    private SecondModel sm;

    @Inject
    public SecondPresenter(Context cn) {
        this.mContext = cn;
        sm=new SecondModel();
    }


    public Context getContext() {
        return mContext;
    }
}
