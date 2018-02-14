package com.example.gamecam.modelapplication.StartActivity.UI;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gamecam.modelapplication.ModelApplication;
import com.example.gamecam.modelapplication.R;
import com.example.gamecam.modelapplication.SecondActivity.UI.SecondActivity;
import com.example.gamecam.modelapplication.StartActivity.Inject.StartModule;

import javax.inject.Inject;

public class StartActivity extends AppCompatActivity {



    @Inject
    StartPresenter stp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ModelApplication.get(this)
                .component()
                .plus(new StartModule(this))
                .inject(this);
        stp.setContext(this);
        stp.inicialize();

        Button btnSave = (Button) findViewById(R.id.button);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stp.changeText();
            }
        });


        Button btnNext = (Button) findViewById(R.id.button2);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SecondActivity.class));
                finish();
            }
        });


    }
}
