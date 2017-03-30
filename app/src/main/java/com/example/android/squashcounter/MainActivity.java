package com.example.android.squashcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA =0;
    int scoreTeamB =0;
    int setTeamA = 0;
    int setTeamB = 0;
    int matchTeamA = 0;
    int matchTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForSetA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForSetB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForMatchA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.match);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForMatchB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.match2);
        scoreView.setText(String.valueOf(score));
    }

    public void freeThrow(View v) {
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    public void twoPoints(View v) {
        setTeamA +=1;
        displayForSetA(setTeamA);
    }

    public void threePoints(View v) {
        matchTeamA +=1;
        displayForMatchA(matchTeamA);
    }

    public void freeThrow2(View v) {
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }

    public void twoPoints2(View v) {
        setTeamB +=1;
        displayForSetB(setTeamB);
    }

    public void threePoints2(View v) {
        matchTeamB +=1;
        displayForMatchB(matchTeamB);
    }


    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        setTeamA = 0;
        setTeamB = 0;
        matchTeamA = 0;
        matchTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
        displayForSetA(0);
        displayForSetB(0);
        displayForMatchA(0);
        displayForMatchB(0);
    }

}
