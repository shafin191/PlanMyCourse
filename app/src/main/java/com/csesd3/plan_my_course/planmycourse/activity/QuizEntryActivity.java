package com.csesd3.plan_my_course.planmycourse.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.csesd3.plan_my_course.planmycourse.R;
import com.csesd3.plan_my_course.planmycourse.dbhelper.DatabaseHandler;

public class QuizEntryActivity extends AppCompatActivity {

    EditText date, subject, syllabus,id;
    Button enter,show,update,delete;
    DatabaseHandler mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_entry);
        date = (EditText) findViewById(R.id.date_text);
        id = (EditText) findViewById(R.id.id_text);
        subject = (EditText) findViewById(R.id.subject_text);
        syllabus = (EditText) findViewById(R.id.syllabus_text);
        enter = (Button) findViewById(R.id.enter_button);
        show=(Button)findViewById(R.id.show_button);
        update=(Button)findViewById(R.id.update_button);
        delete=(Button)findViewById(R.id.delete_button);


        mydb= new DatabaseHandler(this);
        addQuiz();
        viewData();
        updateQuiz();
        deleteQuiz();

    }

    public void deleteQuiz(){
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer deleterow=mydb.deleteQuiz(id.getText().toString());

                if(deleterow>0)
                {
                    Toast.makeText(QuizEntryActivity.this, "Data Deleted", Toast.LENGTH_LONG).show();
                }

                else
                    Toast.makeText(QuizEntryActivity.this, "Data Not Deleted", Toast.LENGTH_LONG).show();
            }
        });



    }


    public void updateQuiz(){
        update.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                boolean isUpdated=mydb.updateQuiz(id.getText().toString(),
                        date.getText().toString(),
                        subject.getText().toString(),
                        syllabus.getText().toString()
                );

                if (isUpdated == true) {
                    Toast.makeText(QuizEntryActivity.this, "Data Updated", Toast.LENGTH_LONG).show();
                } else

                    Toast.makeText(QuizEntryActivity.this, "Data not Updated", Toast.LENGTH_LONG).show();




            }
        });
    }

    public void addQuiz()
    {
        enter.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {

                                         //Toast.makeText(QuizEntryActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                                         boolean isInserted = mydb.addQuiz(date.getText().toString(),
                                                 subject.getText().toString(),
                                                 syllabus.getText().toString()
                                         );

                                         if (isInserted == true) {
                                             Toast.makeText(QuizEntryActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                                         } else

                                             Toast.makeText(QuizEntryActivity.this, "Data not Inserted", Toast.LENGTH_LONG).show();


                                     }
                                 }

        );


    }

    public void viewData()
    {
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = mydb.getAllQuiz();

                if (res.getCount() == 0) {
                    showMessage("Error", "No Data");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("NO : " + res.getString(0) + "\n");
                    buffer.append("DATE : " + res.getString(1) + "\n");
                    buffer.append("SUBJECT : " + res.getString(2) + "\n");
                    buffer.append("SYLLABUS : " + res.getString(3) + "\n\n");


                }
                showMessage("Data", buffer.toString());

            }
        });
    }

    public void showMessage(String title, String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();



    }






}

