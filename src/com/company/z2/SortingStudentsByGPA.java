package com.company.z2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingStudentsByGPA {
    public ArrayList<Person> idNumber = new ArrayList<>();
    private StudentComparatorMarks comparator = new StudentComparatorMarks();

    SortingStudentsByGPA(ArrayList<Person> tmp) {
        this.idNumber = tmp;
        Scanner scan = new Scanner(System.in);
        Collections.sort(idNumber, new StudentComparatorMarks());
        System.out.println("Отсортированные по среднему баллу:");
        out(idNumber);
    }

    public void out(ArrayList<Person> array) {
        for (Person student:array){
            System.out.println(student.toString());
        }
    }
}
