package ru.geekbrains.erik.Lesson5HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Employee {

    private String firstName;
    private String secondName;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salaryRate;
    private int age;

    public Employee(String firstName, String secondName, String position, String eMail, String phoneNumber, int salaryRate, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salaryRate = salaryRate;
        this.age = age;
    }


    void outEmployee () {
        System.out.println("Имя сотрудника: " + firstName);
        System.out.println("Фамилия сотрудника: " + secondName);
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " + eMail);
        System.out.println("Номер телефона: +7" + phoneNumber);
        System.out.println("Размер заработной платы: $" + salaryRate);
        System.out.println("Возраст: " + age);
    }

    public void outEmpArrTo40 (Array[] a) {
        if (age < 40) {
            System.out.println(Arrays.toString(a));
        }
    }



}
