package com.csesd3.plan_my_course.planmycourse.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.csesd3.plan_my_course.planmycourse.R;


public class ShowRoutineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_routine);

        TouchImageView img= (TouchImageView) findViewById(R.id.routineView);
        //WebView im=(WebView) findViewById()

        if(RoutineActivity.sem_rout==1)
        {
            if(SectionRoutineActivity.sec_rout==1)
            {
                img.setImageResource(R.drawable.r11a);

            }

            else if(SectionRoutineActivity.sec_rout==2)
            {
                img.setImageResource(R.drawable.r11b);
            }
        }


        else if(RoutineActivity.sem_rout==2)
        {
            if(SectionRoutineActivity.sec_rout==1)
            {
                img.setImageResource(R.drawable.r12a);

            }

            else if(SectionRoutineActivity.sec_rout==2)
            {
                img.setImageResource(R.drawable.r12b);
            }

            else if(SectionRoutineActivity.sec_rout==3)
            {
                img.setImageResource(R.drawable.r12c);
            }

        }



        else if(RoutineActivity.sem_rout==3)
        {
            if(SectionRoutineActivity.sec_rout==1)
            {
                img.setImageResource(R.drawable.r21a);

            }

            else if(SectionRoutineActivity.sec_rout==2)
            {
                img.setImageResource(R.drawable.r21b);
            }
        }


        else if(RoutineActivity.sem_rout==4)
        {
            if(SectionRoutineActivity.sec_rout==1)
            {
                img.setImageResource(R.drawable.r22a);

            }

            else if(SectionRoutineActivity.sec_rout==2)
            {
                img.setImageResource(R.drawable.r22b);
            }

            else if(SectionRoutineActivity.sec_rout==3)
            {
                img.setImageResource(R.drawable.r22c);
            }

        }

        else if(RoutineActivity.sem_rout==5)
        {
            if(SectionRoutineActivity.sec_rout==1)
            {
                img.setImageResource(R.drawable.r31a);

            }

            else if(SectionRoutineActivity.sec_rout==2)
            {
                img.setImageResource(R.drawable.r31b);
            }
        }


        else if(RoutineActivity.sem_rout==6)
        {
            if(SectionRoutineActivity.sec_rout==1)
            {
                img.setImageResource(R.drawable.r32a);

            }

            else if(SectionRoutineActivity.sec_rout==2)
            {
                img.setImageResource(R.drawable.r32b);
            }

            else if(SectionRoutineActivity.sec_rout==3)
            {
                img.setImageResource(R.drawable.r32c);
            }

        }


        else if(RoutineActivity.sem_rout==7)
        {
            if(SectionRoutineActivity.sec_rout==1)
            {
                img.setImageResource(R.drawable.r41a);

            }

            else if(SectionRoutineActivity.sec_rout==2)
            {
                img.setImageResource(R.drawable.r41b);
            }
        }


        else if(RoutineActivity.sem_rout==8)
        {
            if(SectionRoutineActivity.sec_rout==1)
            {
                img.setImageResource(R.drawable.r42a);

            }

            else if(SectionRoutineActivity.sec_rout==2)
            {
                img.setImageResource(R.drawable.r42b);
            }

            else if(SectionRoutineActivity.sec_rout==3)
            {
                img.setImageResource(R.drawable.r42c);
            }

        }









    }
}
