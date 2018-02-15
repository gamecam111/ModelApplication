package com.example.gamecam.modelapplication.MVP;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;

/**
 * Created by gamecam on 15.2.2018.
 */

public class MVPPresenter  {

    private Context mContext;
    private View actualView;
    private SharedPreferences prefs;

    public MVPPresenter(Context context, SharedPreferences pref) {
        this.mContext = context;
        this.prefs = pref;
    }

    public void setActualContext(Context cn) {
        this.mContext = cn;
        setView();
    }

    public void unSetActualContext() {
        this.mContext = null;
        actualView=null;
    }

    public Context getContext() {
        return mContext;
    }

    public View getView () {
        return actualView;
    }

    public void setView () {
        actualView=((Activity)mContext).getWindow().getDecorView().findViewById(android.R.id.content);
    }

    public void setView (View view) {
        this.actualView=view;
    }

    public SharedPreferences getPrefs() {
        return this.prefs;
    }

}
