package com.indiacraftnation.www.indiacraftnation;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv1= (WebView) findViewById(R.id.wb1);
        wv1.loadUrl("http://www.indiacraftnation.com/");
        WebViewClient wvc= new WebViewClient();
        wv1.setWebViewClient(wvc);

        WebSettings ws= wv1.getSettings();
        ws.setJavaScriptEnabled(true);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode==KeyEvent.KEYCODE_BACK)&&(wv1.canGoBack()))
        {
           wv1.canGoBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);

    }
}
