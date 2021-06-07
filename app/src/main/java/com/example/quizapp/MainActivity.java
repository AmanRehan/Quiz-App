package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup, radioGroup2, radioGroup3, radioGroup4, radioGroup5, radioGroup6;
    static int correct;
    static int wrong;
    ToggleButton toggle1, toggle2, toggle3, toggle4, toggle5, toggle6;
    TextView ans1, ans2, ans3, ans4, ans5, ans6, correctans, wrongans;
    Button submmit;
    CheckBox box1, box2, box3, box4;
    Boolean boxy1 = false, boxy2 = false, boxy3 = false, boxy4 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submmit = findViewById(R.id.submitbtn);
        correctans = findViewById(R.id.correctans);
        wrongans = findViewById(R.id.wrongans);

        box1 = findViewById(R.id.checkbox1);
        box2 = findViewById(R.id.checkbox2);
        box3 = findViewById(R.id.checkbox3);
        box4 = findViewById(R.id.checkbox4);

        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //correct = correct + 1;
                if(b){
                    boxy1=true;
                }
                else {
                    boxy1 =false;
                }
            }
        });

        box2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean c) {
                //correct = correct + 1;
                if(c){
                    boxy2=true;
                }
                else {
                    boxy2 =false;
                }
            }
        });

        box3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean d) {
                //correct = correct + 1;
                if(d){
                    boxy3=true;
                }
                else {
                    boxy3 =false;
                }
            }
        });

        box4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //wrong = wrong + 1;
                if(b){
                    boxy4=true;
                }
                else {
                    boxy4 =false;
                }
            }
        });



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
                if (b) {
                    ans1.setVisibility(View.VISIBLE);
                } else {
                    ans1.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean c) {
                if (c) {
                    ans2.setVisibility(View.VISIBLE);
                } else {
                    ans2.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean d) {
                if (d) {
                    ans3.setVisibility(View.VISIBLE);
                } else {
                    ans3.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean e) {
                if (e) {
                    ans4.setVisibility(View.VISIBLE);
                } else {
                    ans4.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean f) {
                if (f) {
                    ans5.setVisibility(View.VISIBLE);
                } else {
                    ans5.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggle6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean g) {
                if (g) {
                    ans6.setVisibility(View.VISIBLE);
                } else {
                    ans6.setVisibility(View.INVISIBLE);
                }
            }
        });

        /*submmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correctans.setText("Correct answer  :" + correct);
                wrongans.setText("Wrong answers " + wrong);
            }
        });*/


    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void display(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGrp);
        int id = radioGroup.getCheckedRadioButtonId();

        if (id == R.id.q13) {
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
    }

    public void display2(View view) {
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGrp2);
        int id = radioGroup2.getCheckedRadioButtonId();

        if (id == R.id.q22) {
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
    }

    public void display3(View view) {
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGrp3);
        int id = radioGroup3.getCheckedRadioButtonId();

        if (id == R.id.q31) {
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
    }


    public void display4(View view) {
        radioGroup4 = (RadioGroup) findViewById(R.id.radioGrp4);
        int id = radioGroup4.getCheckedRadioButtonId();

        if (id == R.id.q42) {
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
    }

    public void display5(View view) {
        radioGroup5 = (RadioGroup) findViewById(R.id.radioGrp5);
        int id = radioGroup5.getCheckedRadioButtonId();

        if (id == R.id.q53) {
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
    }

    public void display6(View view) {
        radioGroup6 = (RadioGroup) findViewById(R.id.radioGrp6);
        int id = radioGroup6.getCheckedRadioButtonId();

        if (id == R.id.q63) {
            //Toast.makeText(MainActivity.this,"You just clicked cricket",Toast.LENGTH_LONG).show();
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
    }

    public void show1(View view) {
    }

    public void finalDisplay(View view) {
        checker();
        correctans.setText("Correct answer :" + correct);
        wrongans.setText("Wrong Answer :" + wrong);
    }

    public void checker(){
        if(boxy1 && boxy2 && boxy3 && boxy4==false ){
            correct = correct +1;
        }
        else if (boxy1 && boxy2 && boxy3){
            correct += 1;
        }
        else{
            wrong = wrong +1;
        }
    }
}