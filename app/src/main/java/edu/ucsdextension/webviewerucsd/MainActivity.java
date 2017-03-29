package edu.ucsdextension.webviewerucsd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonYahoo, buttonUcsd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonYahoo = (Button) findViewById(R.id.buttonYahoo);
        buttonYahoo.setOnClickListener(this);

        buttonUcsd = (Button) findViewById(R.id.buttonUcsd);
        buttonUcsd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.buttonYahoo:
                Intent y;
                y = new Intent(this, YahooActivity.class);
                startActivity(y);
                break;
            case R.id.buttonUcsd:
                Intent u;
                u = new Intent(this, UcsdActivity.class);
                startActivity(u);
                break;
        }
    }
}
