package com.klassykidz.www.kl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView = (WebView)findViewById(R.id.webView);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("http://www.klassykidz.com/");
        mywebView.setWebViewClient(new WebViewClient());
//some changes


    }

    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack())
            mywebView.goBack();
        else
        super.onBackPressed();
    }
}

