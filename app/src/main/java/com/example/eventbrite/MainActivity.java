package com.example.eventbrite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.eventsFragment:
                Intent intent;
                intent = new Intent(getApplicationContext(),fragmentEvent.class);
                startActivity(intent);
                return true;
            case R.id.searchFragment:
                Intent intentS;
                intentS = new Intent(getApplicationContext(),fragmentSearch.class);
                startActivity(intentS);
                return true;
            case R.id.favoriteFragment:
                // do your code
                return true;
            case R.id.profileFragment:
                Intent intentP;
                intentP = new Intent(getApplicationContext(),fragmentProfile.class);
                startActivity(intentP);
                return true;
            case R.id.orderUnderUserFragment:
                Intent intentT;
                intentT = new Intent(getApplicationContext(),fragmentTicket.class);
                startActivity(intentT);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}