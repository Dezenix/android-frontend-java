package com.example.musicly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class OTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        Objects.requireNonNull(getSupportActionBar()).hide();

        EditText otp = findViewById(R.id.otp);
        CardView next = findViewById(R.id.next);
        TextView no_view = findViewById(R.id.no_otp);
        ImageView back = findViewById(R.id.back);
        TextView edit = findViewById(R.id.edit_my_phone);

        edit.setOnClickListener(v -> {
            onBackPressed();
        });

        back.setOnClickListener(v -> {
            onBackPressed();
        });

        String no = getIntent().getStringExtra("number");
        no_view.setText(no);

        otp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() == 6){
                    next.setCardBackgroundColor(getResources().getColor(R.color.pink));
                    next.setClickable(true);
                }else{
                    next.setCardBackgroundColor(getResources().getColor(R.color.gray));
                    next.setClickable(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        next.setOnClickListener(v -> {
            if(otp.length() == 6){
                Intent intent = new Intent(this,aboutYou.class);
                startActivity(intent);
            }
        });
    }
}