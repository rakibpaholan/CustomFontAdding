package com.example.customfontsetpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView custom_font1,custom_font2;
    private Typeface typeface1,typeface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        custom_font1 = (TextView) findViewById(R.id.custom_font1);
        custom_font2 = (TextView) findViewById(R.id.custom_font2);

        typeface1 = Typeface.createFromAsset(getAssets(),"font/FiraSans_Bold.otf");
        custom_font1.setTypeface(typeface1);
        typeface2 = Typeface.createFromAsset(getAssets(), "font/FiraSans_Book.otf");
        custom_font2.setTypeface(typeface2);


    }
}