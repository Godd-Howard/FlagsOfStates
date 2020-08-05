package com.example.flagsofstates;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, reset;

    private ImageView image1, image2, image3, image4, image5;

    private TextView text1;

    private int rand;
    private  int tracker = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        reset = findViewById(R.id.button6);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);

        text1 = findViewById(R.id.text1);

        randEvent();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (image1.getVisibility() == View.VISIBLE && button1.getText().toString().equals("ALABAMA"))
                {
                    text1.setText("Correct!");
                }
                else if(image2.getVisibility() == View.VISIBLE && button1.getText().toString().equals("CALIFORNIA"))
                {
                    text1.setText("Correct!");
                }
                else if(image3.getVisibility() == View.VISIBLE && button1.getText().toString().equals("MICHIGAN"))
                {
                    text1.setText("Correct!");
                }
                else if(image4.getVisibility() == View.VISIBLE && button1.getText().toString().equals("NEW MEXICO"))
                {
                    text1.setText("Correct!");
                }
                else if(image5.getVisibility() == View.VISIBLE && button1.getText().toString().equals("NORTH CAROLINA"))
                {
                    text1.setText("Correct!");
                }
                else
                {
                    text1.setText("Incorrect");
                }

                buttonDisable();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (image1.getVisibility() == View.VISIBLE && button2.getText().toString().equals("ALABAMA"))
                {
                    text1.setText("Correct!");
                }
                else if(image2.getVisibility() == View.VISIBLE && button2.getText().toString().equals("CALIFORNIA"))
                {
                    text1.setText("Correct!");
                }
                else if(image3.getVisibility() == View.VISIBLE && button2.getText().toString().equals("MICHIGAN"))
                {
                    text1.setText("Correct!");
                }
                else if(image4.getVisibility() == View.VISIBLE && button2.getText().toString().equals("NEW MEXICO"))
                {
                    text1.setText("Correct!");
                }
                else if(image5.getVisibility() == View.VISIBLE && button2.getText().toString().equals("NORTH CAROLINA"))
                {
                    text1.setText("Correct!");
                }
                else
                {
                    text1.setText("Incorrect");
                }

                buttonDisable();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (image1.getVisibility() == View.VISIBLE && button3.getText().toString().equals("ALABAMA"))
                {
                    text1.setText("Correct!");
                }
                else if(image2.getVisibility() == View.VISIBLE && button3.getText().toString().equals("CALIFORNIA"))
                {
                    text1.setText("Correct!");
                }
                else if(image3.getVisibility() == View.VISIBLE && button3.getText().toString().equals("MICHIGAN"))
                {
                    text1.setText("Correct!");
                }
                else if(image4.getVisibility() == View.VISIBLE && button3.getText().toString().equals("NEW MEXICO"))
                {
                    text1.setText("Correct!");
                }
                else if(image5.getVisibility() == View.VISIBLE && button3.getText().toString().equals("NORTH CAROLINA"))
                {
                    text1.setText("Correct!");
                }
                else
                {
                    text1.setText("Incorrect");
                }

                buttonDisable();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (image1.getVisibility() == View.VISIBLE && button4.getText().toString().equals("ALABAMA"))
                {
                    text1.setText("Correct!");
                }
                else if(image2.getVisibility() == View.VISIBLE && button4.getText().toString().equals("CALIFORNIA"))
                {
                    text1.setText("Correct!");
                }
                else if(image3.getVisibility() == View.VISIBLE && button4.getText().toString().equals("MICHIGAN"))
                {
                    text1.setText("Correct!");
                }
                else if(image4.getVisibility() == View.VISIBLE && button4.getText().toString().equals("NEW MEXICO"))
                {
                    text1.setText("Correct!");
                }
                else if(image5.getVisibility() == View.VISIBLE && button4.getText().toString().equals("NORTH CAROLINA"))
                {
                    text1.setText("Correct!");
                }
                else
                {
                    text1.setText("Incorrect");
                }

                buttonDisable();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (image1.getVisibility() == View.VISIBLE && button5.getText().toString().equals("ALABAMA"))
                {
                    text1.setText("Correct!");
                }
                else if(image2.getVisibility() == View.VISIBLE && button5.getText().toString().equals("CALIFORNIA"))
                {
                    text1.setText("Correct!");
                }
                else if(image3.getVisibility() == View.VISIBLE && button5.getText().toString().equals("MICHIGAN"))
                {
                    text1.setText("Correct!");
                }
                else if(image4.getVisibility() == View.VISIBLE && button5.getText().toString().equals("NEW MEXICO"))
                {
                    text1.setText("Correct!");
                }
                else if(image5.getVisibility() == View.VISIBLE && button5.getText().toString().equals("NORTH CAROLINA"))
                {
                        text1.setText("Correct!");
                }
                else
                {
                    text1.setText("Incorrect");
                }

                buttonDisable();

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                randEvent();

            }
        });
    }

    public void randEvent(){
        rand = (int) ((Math.random() * 15) + 1);
        buttonEnable();

        if (rand == 1) {
            if(tracker != 1){
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("NORTH CAROLINA");
                button2.setText("ALABAMA");
                button3.setText("CALIFORNIA");
                button4.setText("MICHIGAN");
                button5.setText("NEW MEXICO");
                tracker = 1;
            }
            else{
                randEvent();
            }
        } else if (rand == 2) {
            if(tracker != 2){
                image2.setVisibility(View.VISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("CALIFORNIA");
                button2.setText("ALABAMA");
                button3.setText("NORTH CAROLINA");
                button4.setText("MICHIGAN");
                button5.setText("NEW MEXICO");
                tracker = 2;
            }
            else{
                randEvent();
            }
        } else if (rand == 3) {
            if(tracker != 3){
                image3.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("NORTH CAROLINA");
                button2.setText("CALIFORNIA");
                button3.setText("ALABAMA");
                button4.setText("NEW MEXICO");
                button5.setText("MICHIGAN");
                tracker = 3;
            }
            else{
                randEvent();
            }
        } else if (rand == 4) {
            if(tracker != 4){
                image4.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("ALABAMA");
                button2.setText("NORTH CAROLINA");
                button3.setText("NEW MEXICO");
                button4.setText("MICHIGAN");
                button5.setText("CALIFORNIA");
                tracker = 4;
            }
            else{
                randEvent();
            }
        } else if (rand == 5){
            if(tracker != 5){
                image5.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                button1.setText("ALABAMA");
                button2.setText("MICHIGAN");
                button3.setText("CALIFORNIA");
                button4.setText("NORTH CAROLINA");
                button5.setText("NEW MEXICO");
                tracker = 5;
            }
            else{
                randEvent();
            }
        }
        else if (rand == 6) {
            if(tracker != 1){
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("NORTH CAROLINA");
                button2.setText("NEW MEXICO");
                button3.setText("CALIFORNIA");
                button4.setText("ALABAMA");
                button5.setText("MICHIGAN");
                tracker = 1;
            }
            else{
                randEvent();
            }
        } else if (rand == 7) {
            if(tracker != 2){
                image2.setVisibility(View.VISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("NORTH CAROLINA");
                button2.setText("ALABAMA");
                button3.setText("CALIFORNIA");
                button4.setText("MICHIGAN");
                button5.setText("NEW MEXICO");
                tracker = 2;
            }
            else{
                randEvent();
            }
        } else if (rand == 8) {
            if(tracker != 3){
                image3.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("MICHIGAN");
                button2.setText("ALABAMA");
                button3.setText("CALIFORNIA");
                button4.setText("NORTH CAROLINA");
                button5.setText("NEW MEXICO");
                tracker = 3;
            }
            else{
                randEvent();
            }
        } else if (rand == 9) {
            if(tracker != 4){
                image4.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("NEW MEXICO");
                button2.setText("ALABAMA");
                button3.setText("CALIFORNIA");
                button4.setText("NORTH CAROLINA");
                button5.setText("MICHIGAN");
                tracker = 4;
            }
            else{
                randEvent();
            }
        } else if (rand == 10){
            if(tracker != 5){
                image5.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                button1.setText("MICHIGAN");
                button2.setText("ALABAMA");
                button3.setText("NORTH CAROLINA");
                button4.setText("NEW MEXICO");
                button5.setText("CALIFORNIA");
                tracker = 5;
            }
            else{
                randEvent();
            }
        }
        else if (rand == 11) {
            if(tracker != 1){
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("NORTH CAROLINA");
                button2.setText("MICHIGAN");
                button3.setText("ALABAMA");
                button4.setText("CALIFORNIA");
                button5.setText("NEW MEXICO");
                tracker = 1;
            }
            else{
                randEvent();
            }
    } else if (rand == 12) {
            if(tracker != 2){
                image2.setVisibility(View.VISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("NEW MEXICO");
                button2.setText("ALABAMA");
                button3.setText("NORTH CAROLINA");
                button4.setText("MICHIGAN");
                button5.setText("CALIFORNIA");
                tracker = 2;
            }
            else{
                randEvent();
            }
    } else if (rand == 13) {
            if(tracker != 3){
                image3.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("ALABAMA");
                button2.setText("NORTH CAROLINA");
                button3.setText("CALIFORNIA");
                button4.setText("MICHIGAN");
                button5.setText("NEW MEXICO");
                tracker = 3;
            }
            else{
                randEvent();
            }
    } else if (rand == 14) {
            if(tracker != 4){
                image4.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                button1.setText("CALIFORNIA");
                button2.setText("NORTH CAROLINA");
                button3.setText("MICHIGAN");
                button4.setText("ALABAMA");
                button5.setText("NEW MEXICO");
                tracker = 4;
            }
            else{
                randEvent();
            }
    } else if (rand == 15) {
            if (tracker != 5) {
                image5.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                button1.setText("NORTH CAROLINA");
                button2.setText("NEW MEXICO");
                button3.setText("MICHIGAN");
                button4.setText("CALIFORNIA");
                button5.setText("ALABAMA");
                tracker = 5;
            } else {
                randEvent();
            }
        }

        text1.setText("");
    }

    public void buttonDisable(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
    }

    public void buttonEnable(){
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
    }

}
