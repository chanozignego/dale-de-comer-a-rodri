package com.redmint.daledecomerarodri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RodriEatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rodri_eat);
    }

    public void eatMeat(View view) {
        TextView happinessTextView = ((TextView) findViewById(R.id.happiness));
        Integer happiness = Integer.parseInt(happinessTextView.getText().toString());
        happiness = happiness - 1;
        happinessTextView.setText(happiness.toString());
    }

    public void eatVegetables(View view) {
        TextView happinessTextView = ((TextView) findViewById(R.id.happiness));
        Integer happiness = Integer.parseInt(happinessTextView.getText().toString());
        happiness = happiness + 1;
        happinessTextView.setText(happiness.toString());
    }
}
