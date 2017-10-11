package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA =0;
    int scoreForTeamB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3pointsForTeamA(View view){
        scoreForTeamA= scoreForTeamA +3;
        displayForTeamA(scoreForTeamA);
    }
    public void add2pointsForTeamA(View view){
        scoreForTeamA =scoreForTeamA +2;
        displayForTeamA(scoreForTeamA);
    }
    public void add1pointForTeamA(View view){
        scoreForTeamA =scoreForTeamA +1;
        displayForTeamA(scoreForTeamA);
    }

    public void resetScores(View view){
        scoreForTeamA=0;
        scoreForTeamB=0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }

    public void add3pointsForTeamB(View view){
        scoreForTeamB= scoreForTeamB +3;
        displayForTeamB(scoreForTeamB);
    }
    public void add2pointsForTeamB(View view){
        scoreForTeamB =scoreForTeamB +2;
        displayForTeamB(scoreForTeamB);
    }
    public void add1pointForTeamB(View view){
        scoreForTeamB =scoreForTeamB +1;
        displayForTeamB(scoreForTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
