package com.csesd3.plan_my_course.planmycourse.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.csesd3.plan_my_course.planmycourse.R;


public class QuizShowActivity extends AppCompatActivity {

    TextView dateshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_show);

        String date=getIntent().getStringExtra("Save");




        dateshow=(TextView)findViewById(R.id.dateView);
        dateshow.setText("Date: "+"");
    }
}
