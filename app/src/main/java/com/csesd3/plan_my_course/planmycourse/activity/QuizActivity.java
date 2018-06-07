package com.csesd3.plan_my_course.planmycourse.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.csesd3.plan_my_course.planmycourse.R;

public class QuizActivity extends AppCompatActivity {

    Button Entry,Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Entry=(Button)findViewById(R.id.entryBTN);
        Show=(Button)findViewById(R.id.showBTN);



        Entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), QuizEntryActivity.class);
                startActivity(i);
            }
        });

        Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), QuizShowActivity.class);
                startActivity(i);
            }
        });




    }



}
