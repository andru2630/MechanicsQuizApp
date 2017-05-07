package com.example.android.mechanicsquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class GameOver extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        TextView message = (TextView) findViewById(R.id.congratulations);

        Intent intent = getIntent();
        int score = intent.getExtras().getInt("score");

        if (score > 0) {
            Toast.makeText(this, getString(R.string.you_scored) + score * 10 + getString(R.string.points), Toast.LENGTH_LONG).show();
        } else {

            Toast.makeText(this, getString(R.string.you_scored) + score * 10 + getString(R.string.points), Toast.LENGTH_LONG).show();
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