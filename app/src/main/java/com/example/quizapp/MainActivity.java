package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6;
    int correct = 0;
    int wrong = 0;
    ToggleButton toggle1,toggle2,toggle3,toggle4,toggle5,toggle6;
    TextView ans1,ans2,ans3,ans4,ans5,ans6,correctans,wrongans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correctans = findViewById(R.id.correctans);
        wrongans = findViewById(R.id.wrongans);

        toggle1 = findViewById(R.id.togbtn1);
        ans1 = findViewById(R.id.answer1);
        toggle2 = findViewById(R.id.togbtn2);
        ans2 = findViewById(R.id.answer2);
        toggle3 = findViewById(R.id.togbtn3);
        ans3 = findViewById(R.id.answer3);
        toggle4 = findViewById(R.id.togbtn4);
        ans4 = findViewById(R.id.answer4);
        toggle5 = findViewById(R.id.togbtn5);
        ans5 = findViewById(R.id.answer5);
        toggle6 = findViewById(R.id.togbtn6);
        ans6 = findViewById(R.id.answer6);

        toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    ans1.setVisibility(View.VISIBLE);
                }
                else {
                    ans1.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean c) {
                if(c){
                    ans2.setVisibility(View.VISIBLE);
                }
                else {
                    ans2.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean d) {
                if(d){
                    ans3.setVisibility(View.VISIBLE);
                }
                else {
                    ans3.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean e) {
                if(e){
                    ans4.setVisibility(View.VISIBLE);
                }
                else {
                    ans4.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean f) {
                if(f){
                    ans5.setVisibility(View.VISIBLE);
                }
                else {
                    ans5.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean g) {
                if(g){
                    ans6.setVisibility(View.VISIBLE);
                }
                else {
                    ans6.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public  void display(View view){
        radioGroup = (RadioGroup) findViewById(R.id.radioGrp);
        int id = radioGroup.getCheckedRadioButtonId();

        if(id == R.id.q13){
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct +1;
        }
        else{
            wrong = wrong + 1;
        }
    }

    public  void display2(View view){
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGrp);
        int id = radioGroup2.getCheckedRadioButtonId();

        if(id == R.id.q22){
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct +1;
        }
        else{
            wrong = wrong + 1;
        }
    }

    public  void display3(View view){
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGrp);
        int id = radioGroup3.getCheckedRadioButtonId();

        if(id == R.id.q31){
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct +1;
        }
        else{
            wrong = wrong + 1;
        }
    }


    public  void display4(View view){
        radioGroup4 = (RadioGroup) findViewById(R.id.radioGrp);
        int id = radioGroup4.getCheckedRadioButtonId();

        if(id == R.id.q42){
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct +1;
        }
        else{
            wrong = wrong + 1;
        }
    }

    public  void display5(View view){
        radioGroup5 = (RadioGroup) findViewById(R.id.radioGrp);
        int id = radioGroup5.getCheckedRadioButtonId();

        if(id == R.id.q53){
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct +1;
        }
        else{
            wrong = wrong + 1;
        }
    }

    public  void display6(View view){
        radioGroup6 = (RadioGroup) findViewById(R.id.radioGrp);
        int id = radioGroup6.getCheckedRadioButtonId();

        if(id == R.id.q63){
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct +1;
        }
        else{
            wrong = wrong + 1;
        }
    }

    public void show1(View view) {
    }

    public void finalDisplay(View view) {
        correctans.setText("" + correct);
        wrongans.setText("" + wrongans);
    }
}