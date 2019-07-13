package com.example.alc5dayschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlcActivity extends AppCompatActivity {

    WebView webView;
    private static String AndelaUrl = "http://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);


        webView = findViewById(R.id.web_view);
        webView.setWebViewClient(new  MyAndelaLoader());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(AndelaUrl);

    }

    private class MyAndelaLoader extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
           view.loadUrl(url);
           return true;
        }

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }
    }
}
