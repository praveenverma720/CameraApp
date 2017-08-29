package com.praveen.cameraapp;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by praveen on 29-08-2017.
 */

public class NewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Uri newUri = Uri.parse(getIntent().getStringExtra("imageUri"));

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageURI(newUri);
    }
}
