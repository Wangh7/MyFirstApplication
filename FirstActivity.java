package com.example.wbb.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1= (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(FirstActivity.this,"Go to Second_layout",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }

        });

    }
}
