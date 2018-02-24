package com.example.android.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void contact(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "650-555-5555", null));
        startActivity(intent);
    }

    protected void link(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.udacity.com"));
        startActivity(intent);
    }

    protected void address(View v){
        Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("2465 Latham St, Mountain View, CA 94040, USA"));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
}
