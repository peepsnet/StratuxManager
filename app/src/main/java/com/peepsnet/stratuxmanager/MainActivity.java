package com.peepsnet.stratuxmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView stratuxWebUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stratuxWebUI = (WebView) findViewById(R.id.webView);
        stratuxWebUI.getSettings().setJavaScriptEnabled(true);
        stratuxWebUI.loadUrl("http://192.168.10.1");
    }
}
