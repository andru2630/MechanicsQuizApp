package com.example.android.mechanicsquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class GameOver extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        TextView message = (TextView) findViewById(R.id.congratulations);

        Intent intent = getIntent();
        int score = intent.getExtras().getInt("score");
        TextView finalScore = (TextView) findViewById(R.id.final_score);

        if (score > 0) {
            finalScore.setText(getString(R.string.you_scored) + score * 10 + getString(R.string.points));
        } else if (score == 0){

            finalScore.setText(getString(R.string.you_scored) + score * 10 + getString(R.string.points));
            message.setText(getString(R.string.try_again));

        }
        Button goToMainMenuButton = (Button)findViewById(R.id.go_to_main_screen);
        goToMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMainMenu();
            }
        });
    }

    protected void goToMainMenu() {
        Intent goToMainMenuActivity = new Intent(this, MainActivity.class);
        startActivity(goToMainMenuActivity);
    }
}