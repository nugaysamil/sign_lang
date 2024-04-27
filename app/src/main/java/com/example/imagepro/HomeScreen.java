package com.example.imagepro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.util.Log;

import com.example.imagepro.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeScreen extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

       bottomNavigationView = findViewById(R.id.bottomNavView);
       frameLayout = findViewById(R.id.frameLayout);

        loadFragment(new Home(), true);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                Log.d("NAVIGATION", "Item ID: " + itemId);

                Fragment selectedFragment = null;
                switch (itemId) {
                    case R.id.navHome:
                        selectedFragment = new Home();
                        break;
                    case R.id.navMic:
                        selectedFragment = new Microphone();
                        break;
                    case R.id.navCamera:
                        selectedFragment = new Camera();
                        break;
                    case R.id.navQuestion:
                        selectedFragment = new Question();
                        break;
                }
                if (selectedFragment != null) {
                    loadFragment(selectedFragment, false);
                }
                return true;
            }
        });
    }

    private void loadFragment(Fragment fragment, boolean appInit) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (appInit) {
            fragmentTransaction.add(R.id.frameLayout, fragment);
        } else {
            fragmentTransaction.replace(R.id.frameLayout, fragment);
        }
        fragmentTransaction.commit();
    }
}
