package com.csesd3.plan_my_course.planmycourse.model;

public class Quiz {


    int _id;
    String _date;
    String _subject;
    String _syllabus;




    public Quiz()
    {

    }
    public Quiz(int Id, String Date, String Subject, String Syllabus)
    {

        this._id=Id;
        this._date =Date;
        this._subject =Subject;
        this._syllabus=Syllabus;

    }

    public Quiz(String Date, String Subject, String Syllabus)
    {
        this._date =Date;
        this._subject =Subject;
        this._syllabus=Syllabus;

    }

    public int getId()
    {
        return this._id;
    }

    public void setId(int Id)
    {
        this._id=Id;
    }

    public String getDate()
    {
        return this._date;
    }

    public void setDate(String Date)
    {
        this._date =Date;
    }


    public String get_subject() {
        return _subject;
    }

    public String get_syllabus() {
        return _syllabus;
    }


    public void set_subject(String _subject) {
        this._subject = _subject;
    }

    public void set_syllabus(String _syllabus) {
        this._syllabus = _syllabus;
    }
}
