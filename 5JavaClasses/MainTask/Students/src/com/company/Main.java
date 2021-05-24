package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    /*Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
    Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные
    на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

    1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.

    Создать массив объектов. Вывести:
    a) список студентов заданного факультета;
    b) списки студентов для каждого факультета и курса;
    c) список студентов, родившихся после заданного года;
    d) список учебной группы.
     */
    public static void main(String[] args) {
        final String  ONE_DATE_FOR_TESTING = "01.03.2012";
        final String TWO_DATE_FOR_TESTING = "01.02.2018";

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date oneDateOfBirth = null;
        Date twoDateOfBirth = null;

        try {
            oneDateOfBirth = format.parse(ONE_DATE_FOR_TESTING);
            twoDateOfBirth = format.parse(TWO_DATE_FOR_TESTING);
        } catch (ParseException e) {
            e.printStackTrace();
        }

	    University university = new University(5);

	    university.addStudent(0,1,"Ivanov", "Ivan");
        university.addStudent(1,2,"Petrov", "Ivan", "", oneDateOfBirth,"", "", "SSS", 2 , 2);
        university.addStudent(2,3,"Petrov", "Pite","", oneDateOfBirth,"", "", "SSS", 2 , 2);
        university.addStudent(3,4,"Sidrov", "Ivan", "", twoDateOfBirth,"", "", "SSS", 2 , 3);
        university.addStudent(4,5,"Sidrov", "Pite","", twoDateOfBirth,"", "", "FFF", 3 , 2);

        university.findStudent("FFF");
        university.findStudent("SSS", 2);
        university.findStudent(oneDateOfBirth);
        university.findStudent("SSS", 2, 2);
    }
}
