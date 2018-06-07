package com.csesd3.plan_my_course.planmycourse.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.csesd3.plan_my_course.planmycourse.R;

public class ShowSyllabusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_syllabus);

        TouchImageView img= (TouchImageView) findViewById(R.id.routineView);
        //WebView im=(WebView) findViewById()

        if(SyllabusActivity.sem_syl==1)
        {
            img.setImageResource(R.drawable.s11a);
           // img.setImageResource(R.drawable.s12a);

        }

        else if(SyllabusActivity.sem_syl==2)
        {
            img.setImageResource(R.drawable.s12a);

        }

    }
}
