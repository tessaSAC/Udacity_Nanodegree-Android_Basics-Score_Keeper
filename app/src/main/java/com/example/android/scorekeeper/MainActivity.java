package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

// Keeps track of scores for two competing archers:
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreA = 0;

    // Tracks the score for Team B
    int scoreB = 0;

    // Some setup I don't understand really
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Archer A Methods:
    public void addOneA(View v) {
        scoreA++;
        displayScoreA(scoreA);
    }

    public void addThreeA(View v) {
        scoreA = scoreA += 3;
        displayScoreA(scoreA);
    }

    public void addFiveA(View v) {
        scoreA = scoreA += 5;
        displayScoreA(scoreA);
    }

    public void addSevenA(View v) {
        scoreA = scoreA += 7;
        displayScoreA(scoreA);
    }

    public void addNineA(View v) {
        scoreA = scoreA += 9;
        displayScoreA(scoreA);
    }

    // Archer B Methods:
    public void addOneB(View v) {
        scoreB++;
        displayScoreB(scoreB);
    }

    public void addThreeB(View v) {
        scoreB = scoreB += 3;
        displayScoreB(scoreB);
    }

    public void addFiveB(View v) {
        scoreB = scoreB += 5;
        displayScoreB(scoreB);
    }

    public void addSevenB(View v) {
        scoreB = scoreB += 7;
        displayScoreB(scoreB);
    }

    public void addNineB(View v) {
        scoreB = scoreB += 9;
        displayScoreB(scoreB);
    }

    // Reset both scores
    public void resetScore(View v) {
        scoreA = 0;
        scoreB = 0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }

    // Display Archer A's score
    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archer_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // Display Archer B's score
    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archer_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
