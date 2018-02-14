package com.example.gamecam.modelapplication.StartActivity.UI;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gamecam.modelapplication.DaggerCore.ApplicationScope;
import com.example.gamecam.modelapplication.R;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by gamecam on 14.2.2018.
 */

@ApplicationScope
public class StartPresenter {
    private Context mContext;
    private StartModel sm;

    private TextView tx;
    private EditText edt;

    private String textInField="";

    @Inject
    public StartPresenter(Context cn) {
        this.mContext = cn;
        sm=new StartModel();
    }


    public Context getContext() {
        return mContext;
    }

    public void setContext(Context c) {
        mContext=c;
    }

    public void changeText () {
    tx.setText(edt.getText());
    textInField=edt.getText().toString();
    }


    public void inicialize() {
        tx=(TextView)(((Activity)mContext).findViewById(R.id.textView));
        edt=(EditText) (((Activity)mContext).findViewById(R.id.editText));
        tx.setText(textInField);
    }

}