package com.atomicworks.pet_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView message;
    private ImageView slashman;
    private View.OnClickListener droidTapListener;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeApp();
    }

    private void initializeApp() {
        message = (TextView) findViewById(R.id.message);
        slashman = (ImageView) findViewById(R.id.imageView2);

        droidTapListener = new View.OnClickListener() {
            public void onClick(View v) {
                TapDroid();
            }
        };

        slashman.setOnClickListener(droidTapListener);
    }

    private void TapDroid() {
        counter++;
        String temp;
        switch (counter)
        {
            case 1:
                temp = "once";
                break;
            case 2:
                temp = "twice";
                break;
            default:
                temp = String.format(Locale.US,"%d times", counter);
        }
        message.setText(String.format("You touched the droid %s", temp));
    }
}
