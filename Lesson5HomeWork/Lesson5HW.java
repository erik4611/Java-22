package ru.geekbrains.erik.Lesson5HomeWork;

import java.util.Arrays;

public class Lesson5HW {
    public static void main(String[] args) {
        Employee erik = new Employee("Erik", "Salyamov", "OTK Specialist", "erik4611@yandex.ru", "(911)289-54-01", 900, 29);

        erik.outEmployee();

        Employee rustam = new Employee("Rustam", "Vahidov", "Dentist", "123@yandex.ru", "(911)334-65-02", 800, 43);
        Employee sergey = new Employee("Sergey", "Stillavin", "Analitic", "125@yandex.ru", "(911)555-65-02", 1200, 55);
        Employee zhoric = new Employee("Sergey", "Stillavin", "Analitic", "125@yandex.ru", "(911)555-65-02", 1200, 55);
        Employee dmitry = new Employee("Zhoric", "Vartanov", "Artist", "555@yandex.ru", "(911)654-65-02", 1300, 39);




        Employee[] empArray = new Employee[5];
        empArray[0] = erik;
        empArray[1] = rustam;
        empArray[2] = sergey;
        empArray[3] = zhoric;
        empArray[4] = dmitry;





    }

}
