package com.example.trainertap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moveButton = findViewById(R.id.getStarted);
        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Step1Activity.class);
                startActivity(intent);
            }
        });

    }

    public void onBackPressed() {
        finishAffinity(); // 모든 액티비티 종료
        finish(); // 현재 액티비티 종료
    }

}