package com.wenceslao.ivan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.mapthunderbird) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:16.611054,120.29"));
            chooser = Intent.createChooser(i, "Choose map app");
            startActivity(chooser);}

    else if (v.getId() == R.id.btnact1) {
        i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    }
}
