package com.example.bai1;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.webapp);
        WebSettings st = view.getSettings();
        st.getJavaScriptEnabled();
        view.loadUrl("file:///android_asset/index.html");
    }
}