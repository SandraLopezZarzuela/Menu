package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verLabelDemo(View view) {
        Intent intent = new Intent(this, Label.class);
        startActivity(intent);
    }
    public void verFleetingImage(View view) {
        Intent i = new Intent(this, Images.class);
        startActivity(i);
    }
    public void verFieldDemo(View view){
        Intent i = new Intent(this, Field.class);
        startActivity(i);
    }
    public void verCheckBoxDemo (View view){
        Intent i = new Intent(this, CheckBox.class);
        startActivity(i);
    }
    public void verRadioDemo (View view) {
        Intent i = new Intent(this, RadioButton.class);
        startActivity(i);
    }
    public void verLinearLayoutDemo (View view) {
        Intent i = new Intent(this, LinearLayout.class);
        startActivity(i);
    }
    public void verBoxModel (View view) {
        Intent i = new Intent(this, Weights.class);
        startActivity(i);
    }
    public void verRelativeLayoutDemo (View view) {
        Intent i = new Intent(this, RelativeLayout.class);
        startActivity(i);
    }
    public void verOverlapDemo (View view) {
        Intent i = new Intent(this, Overlap.class);
        startActivity(i);
    }
    public void verTabulaRasa (View view) {
        Intent i = new Intent(this, tableLayout.class);
        startActivity(i);
    }
    public void verScrollViewDemo(View view) {
        Intent i = new Intent(this, ScrollView.class);
        startActivity(i);
    }
}
