package com.v7ench.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

public class MainActivity extends AppCompatActivity {
HTextView hTextView,hTextView1,hTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hTextView = (HTextView) findViewById(R.id.text);
hTextView1=(HTextView) findViewById(R.id.text1);
        hTextView2=(HTextView) findViewById(R.id.text2);
        hTextView1.animateText("Aplha Safe");
        hTextView2.animateText("Aplha Safe");
        hTextView.animateText("Aplha Safe");

    }
}
