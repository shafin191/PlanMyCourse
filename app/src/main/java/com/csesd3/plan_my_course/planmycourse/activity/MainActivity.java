package com.csesd3.plan_my_course.planmycourse.activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.csesd3.plan_my_course.planmycourse.R;
import com.csesd3.plan_my_course.planmycourse.dbhelper.DatabaseHandler;


public class MainActivity extends ActionBarActivity {

    Button routine,syllabus,cgpa,quiz,settings;
    DatabaseHandler myDB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        routine=(Button)findViewById(R.id.routine_button);
        syllabus=(Button)findViewById(R.id.syllabus_button);
        cgpa=(Button)findViewById(R.id.cgpaCounter_button);
        quiz=(Button)findViewById(R.id.quiz_button);
        settings=(Button)findViewById(R.id.settings_button);

        myDB= new DatabaseHandler(this);


        routine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RoutineActivity.class);
                startActivity(i);
            }
        });



        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SyllabusActivity.class);
                startActivity(i);
            }
        });


        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), layout25.class);
                startActivity(i);
            }
        });


        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(i);
            }
        });







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
