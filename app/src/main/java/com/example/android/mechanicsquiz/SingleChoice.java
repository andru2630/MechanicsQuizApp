package com.example.android.mechanicsquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class SingleChoice extends Activity {
    private int i = 0, score = 0;
    private TextView questionWithASingleAnswer;
    private ImageView singleAnswerImage;
    private RadioButton singleChoiceAnswer1, singleChoiceAnswer2, singleChoiceAnswer3, singleChoiceAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_choice);

        questionWithASingleAnswer = (TextView) findViewById(R.id.question_with_single_answer);
        singleAnswerImage = (ImageView) findViewById(R.id.SingleAnswerImage);
        singleChoiceAnswer1 = (RadioButton) findViewById(R.id.answer_1);
        singleChoiceAnswer2 = (RadioButton) findViewById(R.id.answer_2);
        singleChoiceAnswer3 = (RadioButton) findViewById(R.id.answer_3);
        singleChoiceAnswer4 = (RadioButton) findViewById(R.id.answer_4);

        Button singleChoiceNextQuestionButton = (Button)findViewById(R.id.button_next_question);
        singleChoiceNextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextQuestion();
            }
        });

    }

    private void nextQuestion() {
        if (i == 0) {

            if (singleChoiceAnswer3.isChecked()) {
                score++;
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();

            } else  {

                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();

            }

            questionWithASingleAnswer.setText(R.string.single_choice_question);
            singleChoiceAnswer1.setText(R.string.single_choice_question2_answer1);
            singleChoiceAnswer2.setText(R.string.single_choice_question2_answer2);
            singleChoiceAnswer3.setText(R.string.single_choice_question2_answer3);
            singleChoiceAnswer4.setText(R.string.single_choice_question2_answer4);
            singleAnswerImage.setImageResource(R.drawable.connecting_rod);

        }
        if (i == 1) {

            if (singleChoiceAnswer1.isChecked()) {
                score++;
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();

            }

            questionWithASingleAnswer.setText(R.string.single_choice_question);
            singleChoiceAnswer1.setText(R.string.single_choice_question3_answer1);
            singleChoiceAnswer2.setText(R.string.single_choice_question3_answer2);
            singleChoiceAnswer3.setText(R.string.single_choice_question3_answer3);
            singleChoiceAnswer4.setText(R.string.single_choice_question3_answer4);
            singleAnswerImage.setImageResource(R.drawable.cylinder_block);

        }
        if (i == 2) {
            if (singleChoiceAnswer3.isChecked()) {
                score++;
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();

            }
            questionWithASingleAnswer.setText(R.string.single_choice_question);
            singleChoiceAnswer1.setText(R.string.single_choice_question4_answer1);
            singleChoiceAnswer2.setText(R.string.single_choice_question4_answer2);
            singleChoiceAnswer3.setText(R.string.single_choice_question4_answer3);
            singleChoiceAnswer4.setText(R.string.single_choice_question4_answer4);
            singleAnswerImage.setImageResource(R.drawable.cylinder_head);

        }
        if (i == 3) {
            if (singleChoiceAnswer3.isChecked()) {
                score++;
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();

            }
            questionWithASingleAnswer.setText(R.string.single_choice_question);
            singleChoiceAnswer1.setText(R.string.single_choice_question5_answer1);
            singleChoiceAnswer2.setText(R.string.single_choice_question5_answer2);
            singleChoiceAnswer3.setText(R.string.single_choice_question5_answer3);
            singleChoiceAnswer4.setText(R.string.single_choice_question5_answer4);
            singleAnswerImage.setImageResource(R.drawable.bearings);

        }
        if (i == 4) {
            if (singleChoiceAnswer4.isChecked()) {
                score++;
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();

            }

            Intent goToGameOverActivity = new Intent(this, GameOver.class);
            goToGameOverActivity.putExtra("score", score);
            startActivity(goToGameOverActivity);

            score = 0;
        }
        i++;
        resetRadioBox();

    }

    private void resetRadioBox() {
        singleChoiceAnswer1.setChecked(false);
        singleChoiceAnswer2.setChecked(false);
        singleChoiceAnswer3.setChecked(false);
        singleChoiceAnswer4.setChecked(false);
    }
}


