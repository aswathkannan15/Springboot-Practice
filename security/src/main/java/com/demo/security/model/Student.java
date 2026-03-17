package com.demo.security.model;

public class Student {

    private int studentID;
    private String studentName;
    private int studentMark;

    public Student(int studentID, String studentName, int studentMark) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentMark = studentMark;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentMark() {
        return studentMark;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentMark(int studentMark) {
        this.studentMark = studentMark;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", StudentMark=" + studentMark +
                '}';
    }
}
