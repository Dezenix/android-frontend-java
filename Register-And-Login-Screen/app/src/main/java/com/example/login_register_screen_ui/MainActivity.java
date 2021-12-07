package com.example.login_register_screen_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button register;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // for full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.welcome_screen);
        login = findViewById(R.id.login_button1);
        register = findViewById(R.id.register_button1);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
    }

    public void OpenRegister(View view) {
        Intent intent= new Intent( MainActivity.this, Register.class);

        android.util.Pair pairs[] = new android.util.Pair[2];
        pairs[0] = new android.util.Pair(imageView, "welcome_image");
        pairs[1] = new android.util.Pair(textView, "welcome_text");

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
            startActivity(intent, activityOptions.toBundle());
        }
    }
}

