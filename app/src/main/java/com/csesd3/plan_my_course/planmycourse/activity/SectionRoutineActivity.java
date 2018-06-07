package com.csesd3.plan_my_course.planmycourse.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.csesd3.plan_my_course.planmycourse.R;

public class SectionRoutineActivity extends AppCompatActivity {

    public static int sec_rout=0;
    Button secA,secB,secC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_routine);

        secA=(Button)findViewById(R.id.sectionA_button);
        secB=(Button)findViewById(R.id.sectionB_button);
        secC=(Button)findViewById(R.id.sectionC_button);

        secA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sec_rout =1;
                    Intent i = new Intent(getApplicationContext(), ShowRoutineActivity.class);
                    startActivity(i);



            }
        });



        secB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sec_rout =2;
                Intent i = new Intent(getApplicationContext(), ShowRoutineActivity.class);
                startActivity(i);
            }
        });



        secC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sec_rout =3;
                Intent i = new Intent(getApplicationContext(), ShowRoutineActivity.class);
                startActivity(i);
            }
        });

    }
}
