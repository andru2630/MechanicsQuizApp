package com.example.android.mechanicsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button submit_name = (Button) findViewById(R.id.button_start);
        submit_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitName();
            }
        });
    }
    private void submitName() {
        EditText userNameET = (EditText) findViewById(R.id.user_name);
        String userName = userNameET.getText().toString();

        Intent menuActivityIntent = new Intent(this, MainMenu.class);
        menuActivityIntent.putExtra("UserName", userName);
        startActivity(menuActivityIntent);
    }
}
