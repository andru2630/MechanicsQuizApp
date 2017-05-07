package com.example.android.mechanicsquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainMenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Intent UserNameFromMainActivity = getIntent();
        String UserName = UserNameFromMainActivity.getExtras().getString("UserName");
        TextView UserNameMenuActivity = (TextView) findViewById(R.id.welcome);
        UserNameMenuActivity.setText(getString(R.string.hello) + UserName);

        Button multipleChoiceButton = (Button)findViewById(R.id.multiple_choice_button);
        multipleChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMultipleChoice();
            }
        });
        Button singleChoiceButton = (Button)findViewById(R.id.single_choice_button);
        singleChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSingleChoice();
            }
        });

        Button writeYourAnswerButton = (Button)findViewById(R.id.write_your_answer_button);
        writeYourAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToWrittenAnswer();
            }
        });
    }

    private void goToMultipleChoice() {
        Intent goToMultipleChoice = new Intent(this, MultipleChoice.class);
        startActivity(goToMultipleChoice);
    }

    private void goToSingleChoice() {
        Intent goToSingleOption = new Intent(this, SingleChoice.class);
        startActivity(goToSingleOption);
    }

    private void goToWrittenAnswer() {
        Intent goToWrittenAnswer = new Intent(this, WriteYourAnswer.class);
        startActivity(goToWrittenAnswer);
    }
}