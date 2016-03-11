package com.anohin.artem.seafight;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textStartGame = (TextView) findViewById(R.id.start);
        final TextView textStartGame1 = (TextView) findViewById(R.id.settings);
        final TextView textStartGame2 = (TextView) findViewById(R.id.about);
        final TextView textStartGame3 = (TextView) findViewById(R.id.exit);

        textStartGame.setTypeface(Typeface.createFromAsset(getAssets(), "menu.ttf"));
        textStartGame1.setTypeface(Typeface.createFromAsset(getAssets(), "menu.ttf"));
        textStartGame2.setTypeface(Typeface.createFromAsset(getAssets(), "menu.ttf"));
        textStartGame3.setTypeface(Typeface.createFromAsset(getAssets(), "menu.ttf"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, StartGame.class);
        startActivity(intent);
    }

    public void onClick1(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }


}
