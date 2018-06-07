package com.csesd3.plan_my_course.planmycourse.dbhelper;


import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.csesd3.plan_my_course.planmycourse.model.Quiz;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;

    private static final String DATABASE_NAME="studentQuiz.db";

    private static final String TABLE_NAME="quiz";

    private static final String COLUMN_ID="ID";
    private static final String COLUMN_DATE="DATE";
    private static final String COLUMN_SUBJECT="SUBJECT";
    private static final String COLUMN_SYLLABUS="SYLLABUS";

    public DatabaseHandler(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        SQLiteDatabase db=getWritableDatabase();
        // TODO Auto-generated constructor stub
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String CREATE_CONTACT_TABLE="CREATE TABLE "+TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, DATE TEXT, SUBJECT TEXT, SYLLABUS TEXT)";
        db.execSQL(CREATE_CONTACT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addQuiz(String date,String subject, String syllabus)
    {
		/*SQLiteDatabase db = this.getWritableDatabase();
		String qry ="Insert into "+TABLE_NAME+" ("+KEY_NAME+","+KEY_CONTACTNO+") " +
				"values('"+quiz.getName()+"','"+quiz.getContactNumber()+"')";
		db.execSQL(qry);*/

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues value=new ContentValues();

        value.put(COLUMN_DATE, date);
        value.put(COLUMN_SUBJECT, subject);
        value.put(COLUMN_SYLLABUS, syllabus);

       long result= db.insert(TABLE_NAME, null, value);
        db.close();

        if (result==-1)
        {
            return false;
        }

        else
            return true;

    }

    public Cursor getAllQuiz()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return res;

    }


    public boolean updateQuiz(String id, String date, String subject,String syllabus)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues value=new ContentValues();
        value.put(COLUMN_ID, id);
        value.put(COLUMN_DATE, date);
        value.put(COLUMN_SUBJECT, subject);
        value.put(COLUMN_SYLLABUS, syllabus);

        db.update(TABLE_NAME,value,"ID =?", new String[] { id });

        return  true;

    }

    public Integer deleteQuiz(String id)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID=?", new String[] {id});
        //db.close();
    }


   /* public Quiz getSingleQuiz(int id)
    {
        Quiz myquiz = new Quiz();
        SQLiteDatabase db=this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[] {KEY_ID,KEY_DATE,KEY_SUBJECT,KEY_SYLLABUS}, KEY_ID+"=?",new String[]{String.valueOf(id)} ,null, null,null, null);

        if(cursor!=null)
        {
            cursor.moveToFirst();
            myquiz=new Quiz(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3));
        }

        return myquiz;
    }

    public List<Quiz> getAllQuiz()
    {
        List<Quiz> mycontactList=new ArrayList<Quiz>();
        String selectquery="SELECT * FROM "+ TABLE_NAME;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery(selectquery, null);

        if(cursor.moveToFirst())
        {
            do
            {
                Quiz quiz = new Quiz(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3));
                mycontactList.add(quiz);
            }while(cursor.moveToNext());
        }
        return mycontactList;
    }

    public void updateQuiz(Quiz quiz)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues value=new ContentValues();
        value.put(KEY_DATE, quiz.getDate());
        value.put(KEY_SUBJECT, quiz.get_subject());
        value.put(KEY_SYLLABUS, quiz.get_syllabus());

        db.update(TABLE_NAME, value, KEY_ID+"=?", new String[]{String.valueOf(quiz.getId())});
        db.close();
    }

    public void deleteQuiz(int id)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(TABLE_NAME, KEY_ID+"=?", new String[]{String.valueOf(id)});
        db.close();
    }

    */

}



