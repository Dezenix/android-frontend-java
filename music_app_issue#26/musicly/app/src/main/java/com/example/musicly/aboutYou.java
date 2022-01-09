package com.example.musicly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

import java.util.Calendar;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class aboutYou extends AppCompatActivity {

   TextView birth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_you);

        Objects.requireNonNull(getSupportActionBar()).hide();

        MaterialCardView male, female;
        CardView next;

        next = findViewById(R.id.next);

        birth = findViewById(R.id.birth);
        EditText name = findViewById(R.id.name);

        next.setCardBackgroundColor(getResources().getColor(R.color.pink));

        AtomicReference<String> gender = new AtomicReference<>("");

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        male.setOnClickListener(v -> {
            male.setStrokeWidth(5);
            female.setStrokeWidth(0);
            gender.set("male");
        });

        female.setOnClickListener(v -> {
            male.setStrokeWidth(0);
            female.setStrokeWidth(5);
            gender.set("female");
        });

        birth.setOnClickListener(v -> {
            show();
        });

        next.setOnClickListener(v -> {
            if(gender.toString().length() > 0 && name.length() > 0 && birth.getText().length() == 4){
                Intent intent = new Intent(this,picks.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Provide all the details", Toast.LENGTH_SHORT).show();
            }
        });
    }



    public void show(){
        final Dialog d = new Dialog(aboutYou.this);
        d.setTitle("Year of Birth");
        d.setContentView(R.layout.yearpicker);
        Button b1 = d.findViewById(R.id.button1);
        Button b2 = d.findViewById(R.id.button2);
        final NumberPicker np = d.findViewById(R.id.numberPicker1);
        np.setMinValue(1920);
        np.setMaxValue(Calendar.getInstance().get(Calendar.YEAR) - 2);
        np.setValue(2000);
        b1.setOnClickListener(v -> {
            birth.setText(String.valueOf(np.getValue()));
            d.dismiss();
        });

        b2.setOnClickListener( v -> {
            birth.setText("");
            d.dismiss();
        });

        d.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        d.getWindow().setLayout(CardView.LayoutParams.MATCH_PARENT, CardView.LayoutParams.WRAP_CONTENT);
        d.show();
    }
}