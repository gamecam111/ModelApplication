package com.example.gamecam.modelapplication.StartActivity.UI;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gamecam.modelapplication.DaggerCore.ApplicationScope;
import com.example.gamecam.modelapplication.MVP.MVPPresenter;
import com.example.gamecam.modelapplication.R;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by gamecam on 14.2.2018.
 */

@ApplicationScope
public class StartPresenter extends MVPPresenter {
    private StartModel sm;
    private TextView tx;
    private EditText edt;

    private String textInField="";

    @Inject
    public StartPresenter(Context cn, SharedPreferences sh) {
        super(cn,sh);
        sm=new StartModel();
    }


    public void changeText () {
    tx.setText(edt.getText());
    textInField=edt.getText().toString();
    }


    public void inicialize() {
        tx=(TextView) getView().findViewById(R.id.textView);
        edt=(EditText) getView().findViewById(R.id.editText);
        tx.setText(textInField);
    }


}