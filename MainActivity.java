package com.gmail.kate.guth.pediatrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFirstClick(View view) {
        Intent intent = new Intent(this, Immunizations.class);
        startActivity(intent);
    }
}
