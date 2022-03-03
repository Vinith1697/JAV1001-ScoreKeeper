package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity {

    TextView team1score;
    RadioGroup scoreGroup;
    RadioButton radioButton;
    Button buttonTeamOneAdd;
    Button buttonTeamOneSubtract;
    int team1ScoreTotal = 0;
    int team1update = 0;

    TextView team2score;
    Button buttonTeamTwoAdd;
    Button buttonTeamTwoSubtract;
    int team2ScoreTotal = 0;
    int team2update = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1score = findViewById(R.id.team1score);
        team1score.setText("0");

        scoreGroup = findViewById(R.id.scoreGroup);

        buttonTeamOneAdd = findViewById(R.id.teamOnePlus);
        buttonTeamOneAdd.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                int radioID = scoreGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);

                team1update = Integer.parseInt(radioButton.getText().toString());
                team1ScoreTotal = team1ScoreTotal + team1update;
                team1score.setText(String.valueOf(team1ScoreTotal));
            }
        });

        buttonTeamOneSubtract = findViewById(R.id.teamOneMinus);
        buttonTeamOneSubtract.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                int radioID = scoreGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);

                team1update = Integer.parseInt(radioButton.getText().toString());
                team1ScoreTotal = team1ScoreTotal - team1update;
                if (team1ScoreTotal < 0){
                    team1score.setText("0");
                    team1ScoreTotal = 0;
                }
                else{
                    team1score.setText(String.valueOf(team1ScoreTotal));
                }

            }
        });

        team2score = findViewById(R.id.team2score);
        team2score.setText("0");

        buttonTeamTwoAdd = findViewById(R.id.teamTwoPlus);
        buttonTeamTwoAdd.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                int radioID = scoreGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);

                team2update = Integer.parseInt(radioButton.getText().toString());
                team2ScoreTotal = team2ScoreTotal + team2update;
                team2score.setText(String.valueOf(team2ScoreTotal));
            }
        });

        buttonTeamTwoSubtract = findViewById(R.id.teamTwoMinus);
        buttonTeamTwoSubtract.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                int radioID = scoreGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);

                team2update = Integer.parseInt(radioButton.getText().toString());
                team2ScoreTotal = team2ScoreTotal - team2update;
                if (team2ScoreTotal < 0){
                    team2score.setText("0");
                    team2ScoreTotal = 0;
                }
                else{
                    team2score.setText(String.valueOf(team2ScoreTotal));
                }

            }
        });


    }


    }


