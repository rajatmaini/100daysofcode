package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    ImageView i1,i2,i3,i4;
    TextView t;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);
        b3 = findViewById(R.id.button4);
        b4 = findViewById(R.id.button5);
        i1 = findViewById(R.id.imageView2);
        i2 = findViewById(R.id.imageView3);
        i3 = findViewById(R.id.imageView4);
        i4 = findViewById(R.id.imageView5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = (int) (Math.random()*(6))+1;
                switch (n)
                {
                    case 1: i1.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                            break;
                    case 2: i1.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                            break;
                    case 3: i1.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                            break;
                    case 4: i1.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                            break;
                    case 5: i1.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                            break;
                    default: i1.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = (int) (Math.random()*(6))+1;
                switch (n)
                {
                    case 1: i2.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2: i2.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3: i2.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4: i2.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5: i2.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    default: i2.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = (int) (Math.random()*(6))+1;
                switch (n)
                {
                    case 1: i3.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2: i3.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3: i3.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4: i3.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5: i3.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    default: i3.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = (int) (Math.random()*(6))+1;
                switch (n)
                {
                    case 1: i4.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2: i4.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3: i4.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4: i4.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5: i4.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    default: i4.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                }
            }
        });
    }
}