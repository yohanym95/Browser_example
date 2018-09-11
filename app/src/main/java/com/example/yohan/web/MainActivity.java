package com.example.yohan.web;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText text;
    WebView web_browser;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addclicklistner();

    }

    public void addclicklistner(){
        button1 = findViewById(R.id.button);
        text = findViewById(R.id.editText);
        web_browser = findViewById(R.id.webview);

        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url = text.getText().toString();
                        web_browser.getSettings().setLoadsImagesAutomatically(true);
                        web_browser.getSettings().setJavaScriptEnabled(true);
                        web_browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                        web_browser.loadUrl(url);


                    }
                }
        );

    }
}
