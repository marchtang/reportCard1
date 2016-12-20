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

    @Override
    public String toString() {
        return "ReportCard{" +
                "studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseScore=" + courseScore +
                '}';
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName(){return studentName;}

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName(){return courseName;}

    public void setCourseScore(int courseScore) {
        this.courseScore = courseScore;
    }

    public int getCourseScore(){return courseScore;}
}
