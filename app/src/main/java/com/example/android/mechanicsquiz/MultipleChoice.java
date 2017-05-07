package com.example.android.mechanicsquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MultipleChoice extends Activity {
    private int i = 0, score = 0;
    private TextView multipleChoiceQuestion;
    private CheckBox multipleChoiceAnswer1, multipleChoiceAnswer2, multipleChoiceAnswer3, multipleChoiceAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);
        multipleChoiceQuestion = (TextView) findViewById(R.id.multiple_question);
        multipleChoiceAnswer1 = (CheckBox) findViewById(R.id.multiple_answer1);
        multipleChoiceAnswer2 = (CheckBox) findViewById(R.id.multiple_answer2);
        multipleChoiceAnswer3 = (CheckBox) findViewById(R.id.multiple_answer3);
        multipleChoiceAnswer4 = (CheckBox) findViewById(R.id.multiple_answer4);

        Button nextQuestionButton = (Button)findViewById(R.id.button_next_question);
        nextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextQuestion();
            }
        });
    }

    private void nextQuestion() {
        if (i == 0) {
            if (multipleChoiceAnswer1.isChecked() && multipleChoiceAnswer2.isChecked() &&
                    !multipleChoiceAnswer3.isChecked() && !multipleChoiceAnswer4.isChecked()) {
                score++;
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            multipleChoiceQuestion.setText(R.string.multiple_choice_question_2);
            multipleChoiceAnswer1.setText(R.string.multiple_choice_question2_answer1);
            multipleChoiceAnswer2.setText(R.string.multiple_choice_question2_answer2);
            multipleChoiceAnswer3.setText(R.string.multiple_choice_question2_answer3);
            multipleChoiceAnswer4.setText(R.string.multiple_choice_question2_answer4);
        }
        if (i == 1) {
            if (multipleChoiceAnswer1.isChecked() && multipleChoiceAnswer2.isChecked()
                    && multipleChoiceAnswer3.isChecked() && !multipleChoiceAnswer4.isChecked()) {
                score++;
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            multipleChoiceQuestion.setText(R.string.multiple_choice_question_3);
            multipleChoiceAnswer1.setText(R.string.multiple_choice_question3_answer1);
            multipleChoiceAnswer2.setText(R.string.multiple_choice_question3_answer2);
            multipleChoiceAnswer3.setText(R.string.multiple_choice_question3_answer3);
            multipleChoiceAnswer4.setText(R.string.multiple_choice_question3_answer4);
        }
        if (i == 2) {
            if (multipleChoiceAnswer1.isChecked() && multipleChoiceAnswer4.isChecked()
                    && !multipleChoiceAnswer2.isChecked() && !multipleChoiceAnswer3.isChecked()) {
                score++;
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            multipleChoiceQuestion.setText(R.string.multiple_choice_question_4);
            multipleChoiceAnswer1.setText(R.string.multiple_choice_question4_answer1);
            multipleChoiceAnswer2.setText(R.string.multiple_choice_question4_answer2);
            multipleChoiceAnswer3.setText(R.string.multiple_choice_question4_answer3);
            multipleChoiceAnswer4.setText(R.string.multiple_choice_question4_answer4);
        }
        if (i == 3) {
            if (multipleChoiceAnswer1.isChecked() && multipleChoiceAnswer2.isChecked() && multipleChoiceAnswer3.isChecked() && multipleChoiceAnswer4.isChecked()) {
                score++;
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            multipleChoiceQuestion.setText(R.string.multiple_choice_question_5);
            multipleChoiceAnswer1.setText(R.string.multiple_choice_question5_answer1);
            multipleChoiceAnswer2.setText(R.string.multiple_choice_question5_answer2);
            multipleChoiceAnswer3.setText(R.string.multiple_choice_question5_answer3);
            multipleChoiceAnswer4.setText(R.string.multiple_choice_question5_answer4);
        }

        if (i == 4) {
            if (multipleChoiceAnswer1.isChecked() && multipleChoiceAnswer2.isChecked()
                    && multipleChoiceAnswer4.isChecked() && !multipleChoiceAnswer3.isChecked()) {
                score++;
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            Intent goToGameOverActivity = new Intent(this, GameOver.class);
            goToGameOverActivity.putExtra("score", score);
            startActivity(goToGameOverActivity);
            score = 0;
        }
        i++;
        resetCheckbox();
    }

    private void resetCheckbox() {
        multipleChoiceAnswer1.setChecked(false);
        multipleChoiceAnswer2.setChecked(false);
        multipleChoiceAnswer3.setChecked(false);
        multipleChoiceAnswer4.setChecked(false);
    }
}