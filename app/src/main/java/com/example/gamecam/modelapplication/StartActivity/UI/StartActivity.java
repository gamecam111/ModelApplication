package com.example.gamecam.modelapplication.StartActivity.UI;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gamecam.modelapplication.DaggerCore.ApplicationCore;
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
        System.out.println("Test");

        //Inject do aktivity
        ModelApplication.get(this)
                .component()
                .plus(new StartModule(getApplicationContext()))
                .inject(this);


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

    //Metoda on start zabezpečujúca nahranie aktuálneho kontextu
    @Override
    protected void onStart() {
        super.onStart();
        stp.setContext(this);
        stp.inicialize();
    }

    //Vymazanie aktuálneho kontextu
    @Override
    protected void onStop() {
        super.onStop();
        stp.setContext(null);
    }


}
