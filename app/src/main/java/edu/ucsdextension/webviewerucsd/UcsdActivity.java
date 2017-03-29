package edu.ucsdextension.webviewerucsd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class UcsdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsd);

        WebView ucsdView = (WebView) findViewById(R.id.webViewUcsd);
        ucsdView.loadUrl("https://extension.ucsd.edu/");
    }
}
