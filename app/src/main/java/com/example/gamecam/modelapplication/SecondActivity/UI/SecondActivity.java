package com.example.gamecam.modelapplication.SecondActivity.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gamecam.modelapplication.R;
import com.example.gamecam.modelapplication.StartActivity.UI.StartActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnBack = (Button) findViewById(R.id.button4);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StartActivity.class));
                finish();
            }
        });

    }
}
