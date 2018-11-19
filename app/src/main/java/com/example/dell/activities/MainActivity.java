package com.example.dell.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchActivity(View view) {

        final TextView txt = findViewById(R.id.txt);
        String str = txt.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Message", str);
        startActivity(intent);
    }
}
