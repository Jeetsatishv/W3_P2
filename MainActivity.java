package com.example.w3_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LogName", "onCreate Activity Started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("Hello");
                textView.setText("Hello");
            }
        });
    }

    protected void onStart() {
        super.onStart();
        Log.i("LogName", "OnStart Activity Started");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("LogName", "OnRestart Activity Started");
    }

    protected void onResume() {
        super.onResume();
        Log.i("LogName", "OnResume Activity Started");
    }

    protected void onPause() {
        super.onPause();
        Log.i("LogName", "OnPause Activity Started");
    }

    protected void onStop() {
        super.onStop();
        Log.i("LogName", "OnStop Activity Started");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("LogName", "OnDestroy Activity Started");
    }




}