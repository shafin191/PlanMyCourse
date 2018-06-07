package com.csesd3.plan_my_course.planmycourse.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.csesd3.plan_my_course.planmycourse.R;

public class RoutineActivity extends AppCompatActivity {

    Button sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    public static int sem_rout =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        sem1=(Button)findViewById(R.id.sem1_button);
        sem2=(Button)findViewById(R.id.sem2_button);
        sem3=(Button)findViewById(R.id.sem3_button);
        sem4=(Button)findViewById(R.id.sem4_button);
        sem5=(Button)findViewById(R.id.sem5_button);
        sem6=(Button)findViewById(R.id.sem6_button);
        sem7=(Button)findViewById(R.id.sem7_button);
        sem8=(Button)findViewById(R.id.sem8_button);


        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem_rout =1;
                Intent i = new Intent(getApplicationContext(), SectionRoutineActivity.class);
                startActivity(i);
            }
        });



         sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem_rout =2;
                Intent i = new Intent(getApplicationContext(), SectionRoutineActivity.class);
                startActivity(i);
            }
        });


        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem_rout =3;
                Intent i = new Intent(getApplicationContext(), SectionRoutineActivity.class);
                startActivity(i);
            }
        });



        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem_rout =4;
                Intent i = new Intent(getApplicationContext(), SectionRoutineActivity.class);
                startActivity(i);
            }
        });


        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem_rout =5;
                Intent i = new Intent(getApplicationContext(), SectionRoutineActivity.class);
                startActivity(i);
            }
        });



        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem_rout =6;
                Intent i = new Intent(getApplicationContext(), SectionRoutineActivity.class);
                startActivity(i);
            }
        });


        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem_rout =7;
                Intent i = new Intent(getApplicationContext(), SectionRoutineActivity.class);
                startActivity(i);
            }
        });



        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem_rout =8;
                Intent i = new Intent(getApplicationContext(), SectionRoutineActivity.class);
                startActivity(i);
            }
        });






    }
}
