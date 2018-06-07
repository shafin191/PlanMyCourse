package com.csesd3.plan_my_course.planmycourse.dbhelper;


import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CGPADataBase extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;

    private static final String DATABASE_NAME="studentQuiz.db";

    private static final String TABLE_NAME="quiz";

    private static final String COLUMN_ID="ID";
    private static final String col2="SUBJECT1";
    private static final String col3="SUBJECT2";
    private static final String col4="SUBJECT3";
    private static final String col5="SUBJECT4";
    private static final String col6="SUBJECT5";
    private static final String col7="LAB1";
    private static final String col8="LAB2";
    private static final String col9="LAB3";
    private static final String col10="LAB4";
    private static final String col11="LAB5";


    public CGPADataBase(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        SQLiteDatabase db=getWritableDatabase();
        // TODO Auto-generated constructor stub
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String QUERY="CREATE TABLE "+TABLE_NAME+
                " (ID INTEGER PRIMARY KEY AUTOINCREMENT, SUBJECT1 REAL, SUBJECT2 REAL, SUBJECT3 REAL, SUBJECT4 REAL, SUBJECT5 REAL, LAB1 REAL, LAB2 REAL, LAB3 REAL, LAB4 REAL, LAB5 REAL)";
        db.execSQL(QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addSubject(float sub1,float sub2,float sub3, float sub4,  float sub5)
    {


        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues value=new ContentValues();

        value.put(col2,sub1);
        value.put(col3,sub2);
        value.put(col4,sub3);
        value.put(col5,sub4);
        value.put(col6, sub5);


        long result= db.insert(TABLE_NAME, null, value);
        db.close();

        if (result==-1)
        {
            return false;
        }

        else
            return true;

    }


    public boolean addSessional(float lab1,float lab2,float lab3, float lab4,  float lab5)
    {


        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues value=new ContentValues();

        value.put(col7,lab1);
        value.put(col8,lab2);
        value.put(col9,lab3);
        value.put(col10,lab4);
        value.put(col11,lab5);


        long result= db.insert(TABLE_NAME, null, value);
        db.close();

        if (result==-1)
        {
            return false;
        }

        else
            return true;

    }


}
