package com.example.lenovo520.diseaseprediction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity{


        private WebView webView;

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.webview);
            ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle("Info");
            actionBar.setDisplayHomeAsUpEnabled(true);

            Intent i = getIntent();
            String url= i.getStringExtra("url");
            webView = (WebView) findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(url);

        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            onBackPressed();
            return true;
        }

    }
