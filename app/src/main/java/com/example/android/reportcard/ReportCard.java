package com.example.android.reportcard;

/**
 * Created by march on 2016/12/13.
 */

public class ReportCard {
    private String studentName;
    private String courseName;
    private int courseScore;

    /**create  a new ReportCard object
     *
     */
    public ReportCard(String stuName,String courName,int courScore){
        studentName= stuName;
        courseName=courName;
        courseScore=courScore;
    }
    public String getStudentName(){return studentName;}
    public String getCourseName(){return courseName;}
    public int getCourseScore(){return courseScore;}
}
