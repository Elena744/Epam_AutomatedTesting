package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class University {
    private Student[] students;

    public University(int size) {
        this.students = new Student[size];
    }

    public University(){
        this.students = new Student[5];
    }

    public void addStudent(int i, int id, String surname, String name){
        this.students[i] = new Student(id, surname, name);
    }

    public void addStudent(int i, int id, String surname, String name, String lastname, Date dateOfBirth, String address, String phoneNumber, String faculty, int course, int group){
        this.students[i] = new Student(id, surname, name, lastname, dateOfBirth, address, phoneNumber, faculty, course, group);
    }
     public void findStudent(String faculty){
        System.out.println("Список студентов факультета " + faculty + ":");
         for (int i = 0; i < students.length; i++){
             if (students[i].getFaculty() == faculty) {
                 System.out.println(students[i].toString());
             }
         }

     }
    public void findStudent(String faculty, int course){
        System.out.println("Список студентов факультета " + faculty + " и курса " + course +":");
        for (int i = 0; i < students.length; i++){
            if (students[i].getFaculty() == faculty && students[i].getCourse() == course) {
                System.out.println(students[i].toString());
            }
        }
    }
    public void findStudent(Date dateOfBirth){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfBirth);
        int year = calendar.get(calendar.YEAR);

        System.out.println("Список студентов, родившихся после " + year + " года:");
        for (int i = 0; i < students.length; i++){
            if (students[i].getYearOfBirth() > year){
                System.out.println(students[i].toString());
            }
        }
    }
    public void findStudent(String faculty, int course, int group){
        System.out.println("Список студентов факультета " + faculty + " курса " + course + " группы " + group + ":");
        for (int i = 0; i < students.length; i++){
            if (students[i].getFaculty() == faculty && students[i].getCourse() == course && students[i].getGroup() == group) {
                System.out.println(students[i].toString());
            }
        }
    }
}
