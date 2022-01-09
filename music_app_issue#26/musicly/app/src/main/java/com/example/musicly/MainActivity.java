package com.example.musicly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.WindowManager;
import android.widget.EditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        EditText no = findViewById(R.id.number);
        CardView button = findViewById(R.id.login);

        no.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() == 10){
                    button.setCardBackgroundColor(getResources().getColor(R.color.pink));
                    button.setClickable(true);
                }else{
                    button.setCardBackgroundColor(getResources().getColor(R.color.gray));
                    button.setClickable(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        button.setOnClickListener(v -> {
            if(no.length() == 10){
                Intent intent = new Intent(this,OTP.class);
                Log.e("no : ", no.getText().toString());
                intent.putExtra("number",no.getText().toString());
                startActivity(intent);
            }
        });
    }
}