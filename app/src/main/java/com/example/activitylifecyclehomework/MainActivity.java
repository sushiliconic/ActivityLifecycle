package com.example.activitylifecyclehomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int count_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.counter);
        if(savedInstanceState != null){
            count_value = savedInstanceState.getInt("count");
            textView.setText(String.valueOf(count_value));
        }
    }

    public void addcount(View view){
        count_value = Integer.parseInt(textView.getText().toString());
        count_value++;
        textView.setText(String.valueOf(count_value));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",count_value);
    }

}