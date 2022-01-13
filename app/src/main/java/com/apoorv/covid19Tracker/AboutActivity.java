package com.apoorv.covid19Tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.apoorv.covid19Tracker.R;

public class AboutActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    public void openGit(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Apoorv-Varshney")));
    }

    public void openInsta(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/apoorv_varshney/")));
    }

    public void openLinkedin(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/apoorv-varshney24/")));
    }

    public void openFacebook(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100069398179371")));
    }
}