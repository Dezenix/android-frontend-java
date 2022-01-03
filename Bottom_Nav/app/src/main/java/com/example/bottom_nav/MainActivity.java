package com.example.bottom_nav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    //initialize var

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav=findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,new Frag_Subjects()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment=null;

                    switch(item.getItemId()){
                        case R.id.nav_subjects:
                            selectedFragment=new Frag_Subjects();
                            break;
                        case R.id.nav_timetable:
                            selectedFragment=new Frag_Timetable();
                            break;
                        case R.id.nav_report:
                            selectedFragment=new Frag_Report();
                            break;
                        case R.id.nav_history:
                            selectedFragment=new Frag_History();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,selectedFragment).commit();
                    return true;

                }
            };
}
