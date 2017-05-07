package com.example.android.mechanicsquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class WriteYourAnswer extends Activity {

    private int i = 0, score = 0;
    private TextView writeYourAnswerQ;
    private ImageView writeYourAnswerImage;
    private EditText writeYourAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_your_answer);
        writeYourAnswerQ = (TextView) findViewById(R.id.question_for_write_your_answer_activity);
        writeYourAnswerImage = (ImageView) findViewById(R.id.write_your_answer_image);
        writeYourAnswer = (EditText) findViewById(R.id.write_your_answer);

        final Button nextQuestionButton = (Button)findViewById(R.id.button_next_question);
        nextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextQuestion();
            }
        });
    }

    private void nextQuestion() {
        if (i == 0) {
            TextView answer = (TextView) findViewById(R.id.write_your_answer);
            if (answer.getText().toString().equalsIgnoreCase("valve")) {
                Toast.makeText(this, "Right!", Toast.LENGTH_SHORT).show();
                score++;

            } else {
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            writeYourAnswerQ.setText(R.string.writeIt_question);
            writeYourAnswerImage.setImageResource(R.drawable.crankshaft);
        }

        if (i == 1) {
            TextView answer = (TextView) findViewById(R.id.write_your_answer);
            if (answer.getText().toString().equalsIgnoreCase("crankshaft")) {
                Toast.makeText(this, "Right!", Toast.LENGTH_SHORT).show();
                score++;

            } else {
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            writeYourAnswerQ.setText(R.string.writeIt_question);
            writeYourAnswerImage.setImageResource(R.drawable.camshaft);
        }

        if (i == 2) {
            TextView answer = (TextView) findViewById(R.id.write_your_answer);
            if (answer.getText().toString().equalsIgnoreCase("camshaft")) {
                Toast.makeText(this, "Right!", Toast.LENGTH_SHORT).show();
                score++;

            } else {
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            writeYourAnswerQ.setText(R.string.writeIt_question);
            writeYourAnswerImage.setImageResource(R.drawable.injector);
        }

        if (i == 3) {
            TextView answer = (TextView) findViewById(R.id.write_your_answer);
            if (answer.getText().toString().equalsIgnoreCase("injector")) {
                Toast.makeText(this, "Right!", Toast.LENGTH_SHORT).show();
                score++;

            } else {
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            writeYourAnswerQ.setText(R.string.writeIt_question);
            writeYourAnswerImage.setImageResource(R.drawable.drive_belt);
        }

        if (i == 4) {
            TextView answer = (TextView) findViewById(R.id.write_your_answer);
            if (answer.getText().toString().equalsIgnoreCase("drive belt")) {
                Toast.makeText(this, "Right!", Toast.LENGTH_SHORT).show();
                score++;

            } else {
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
            }
            Intent goToGameOverActivity = new Intent(this, GameOver.class);
            goToGameOverActivity.putExtra("score", score);
            startActivity(goToGameOverActivity);
        }

        i++;
        writeYourAnswer.getText().clear();
    }
}