package com.example.intentactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etname;
    Button btact2, btact3;
   final int ACTIVITY3 = 3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname = findViewById(R.id.etname);
        btact2 = findViewById(R.id.btact2);
        btact3 = findViewById(R.id.btact3);

        btact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etname.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Something", Toast.LENGTH_SHORT).show();
                } else {
                    String name = etname.getText().toString().trim();


                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("name", name);
                    startActivity(intent);

                }
            }
        });

        btact3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                

            }
        });

    }
}