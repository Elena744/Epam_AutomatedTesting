package com.company;

import java.util.Calendar;
import java.util.Date;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String lastname;
    private Date dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private int group;

    public Student(int id, String surname, String name) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastname = "";
        this.dateOfBirth = new Date();
        this.address = "";
        this.phoneNumber = "";
        this.faculty = "FFF";
        this.course = 0;
        this.group = 0;
    }

    public Student(int id, String surname, String name, String lastname, Date dateOfBirth, String address, String phoneNumber, String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public int getYearOfBirth(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.dateOfBirth);
        return calendar.get(calendar.YEAR);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String toString(){
        return (getSurname() + " " + getName() + " " + getDateOfBirth() + " " + getFaculty() + " " + getCourse() + " " + getGroup());
    }

}
