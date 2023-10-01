package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class chooseActivity extends AppCompatActivity {
ImageView Xtxt ,Otxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        Xtxt = findViewById(R.id.x);
        Otxt = findViewById(R.id.o);
        Xtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = 0;
                Intent intent = new Intent(chooseActivity.this,MainActivity.class);
                intent.putExtra("",value);
                startActivity(intent);
            }
        });

        Otxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = 1;
                Intent intent = new Intent(chooseActivity.this,MainActivity.class);
                intent.putExtra("",value);
                startActivity(intent);
            }
        });

    }
}