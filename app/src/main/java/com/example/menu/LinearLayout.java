package com.example.menu;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayout extends AppCompatActivity
            implements RadioGroup.OnCheckedChangeListener {
        RadioGroup orientation;
        RadioGroup gravity;

        @Override
        public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
            setContentView(R.layout.linearlayout);

            orientation=(RadioGroup)findViewById(R.id.orientation);
            orientation.setOnCheckedChangeListener(this);
            gravity=(RadioGroup)findViewById(R.id.gravity);
            gravity.setOnCheckedChangeListener(this);
        }

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.horizontal:
                    orientation.setOrientation(android.widget.LinearLayout.HORIZONTAL);
                    break;

                case R.id.vertical:
                    orientation.setOrientation(android.widget.LinearLayout.VERTICAL);
                    break;
                case R.id.left:
                gravity.setGravity(Gravity.LEFT);
                break;

                case R.id.center:
                gravity.setGravity(Gravity.CENTER_HORIZONTAL);
                break;

                case R.id.right:
                gravity.setGravity(Gravity.RIGHT);
                break;
            }
        }
}
