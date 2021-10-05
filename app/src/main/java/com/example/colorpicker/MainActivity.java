package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private TextView textViewColor;
    private SeekBar sBar;
    private SeekBar sBar2;
    private SeekBar sBar3;
    int red;
    int green;
    int blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//final int[] szin = new int[2];
        init();
//final int[] szin = new int[2];
        sBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar sBar, int i, boolean b) {
                Toast.makeText(MainActivity.this, "onProgressChanged", Toast.LENGTH_SHORT).show();
                //textViewColor.setText("Percentage"+i);
                //layout.setBackgroundColor(Color.rgb(i,0,0));
                //szin[0] = i;
                red = i;

                layout.setBackgroundColor(Color.rgb(red,green,blue));
                textViewColor.setText("Színkeverés(RGB): "+red*255/100+" red, / "+green*255/100+" green, / "+blue*255/100+" blue");

            }

            @Override
            public void onStartTrackingTouch(SeekBar sBar) {
                Toast.makeText(MainActivity.this, "onStartProgressChanged", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar sBar) {
                Toast.makeText(MainActivity.this, "onStopProgressChanged", Toast.LENGTH_SHORT).show();

            }
        });
        sBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar sBar2, int j, boolean b) {
                Toast.makeText(MainActivity.this, "onProgressChanged", Toast.LENGTH_SHORT).show();
                //textViewColor.setText("Percentage"+j);
                //layout.setBackgroundColor(Color.rgb(0,j,0));
                green = j;

                layout.setBackgroundColor(Color.rgb(red,green,blue));
                textViewColor.setText("Színkeverés(RGB): "+red*255/100+" red, / "+green*255/100+" green, / "+blue*255/100+" blue");

            }

            @Override
            public void onStartTrackingTouch(SeekBar sBar2) {
                Toast.makeText(MainActivity.this, "onStartProgressChanged", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar sBar2) {
                Toast.makeText(MainActivity.this, "onStopProgressChanged", Toast.LENGTH_SHORT).show();

            }
        });

        sBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar sBar3, int k, boolean b) {
                Toast.makeText(MainActivity.this, "onProgressChanged", Toast.LENGTH_SHORT).show();
                //textViewColor.setText("Percentage"+k);
                //layout.setBackgroundColor(Color.rgb(0,0,k));
                blue = k;


                layout.setBackgroundColor(Color.rgb(red,green,blue));
                textViewColor.setText("Színkeverés (RGB): "+red*255/100+" red, / "+green*255/100+" green, / "+blue*255/100+" blue");

            }

            @Override
            public void onStartTrackingTouch(SeekBar sBar3) {
                Toast.makeText(MainActivity.this, "onStartProgressChanged", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar sBar3) {
                Toast.makeText(MainActivity.this, "onStopProgressChanged", Toast.LENGTH_SHORT).show();

            }
        });



        //layout.setBackgroundColor(Color.rgb(red,green,blue));
        //textViewColor.setText(red+","+green);

    }
    public void init(){
        layout = findViewById(R.id.layout); //R.-res, id xml és java összekapcsolása
        textViewColor = findViewById(R.id.textViewColor);
        sBar = (SeekBar) findViewById(R.id.seekBar);
        sBar2 = (SeekBar) findViewById(R.id.seekBar2);
        sBar3 = (SeekBar) findViewById(R.id.seekBar3);    }


}