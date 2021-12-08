package com.example.login_register_screen_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private EditText editText;
    private EditText editText1;
    private EditText editText2;
    private Button button;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        imageView = findViewById(R.id.imageView2);
        textView = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView3);
        editText = findViewById(R.id.email);
        editText1 = findViewById(R.id.password);
        editText2 = findViewById(R.id.cpassword);
        button = findViewById(R.id.register_button2);
    }
    public void OpenLoginScreen(View view) {
        Intent intent= new Intent( Register.this, Login.class);

        android.util.Pair pairs[] = new android.util.Pair[7];
        pairs[0] = new android.util.Pair(button, "login_button");
        pairs[1] = new android.util.Pair(textView2, "login_text2");
        pairs[2] = new android.util.Pair(editText, "login_text");
        pairs[3] = new android.util.Pair(editText1, "login_text");
        pairs[4] = new android.util.Pair(editText2, "login_text");
        pairs[5] = new android.util.Pair(textView, "welcome_text");
        pairs[6] = new android.util.Pair(imageView, "welcome_image");

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(Register.this, pairs);
            startActivity(intent, activityOptions.toBundle());
        }
    }
}