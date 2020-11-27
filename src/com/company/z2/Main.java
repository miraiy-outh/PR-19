package com.company.z2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> idNumber = new ArrayList<>();
        System.out.println("Введите количество студентов:");
        int cnt = scan.nextInt();
        System.out.println("Введите данные студентов:");
        for (int i = 0; i < cnt; i++) {
            idNumber.add(new Student(scan.next(), scan.nextDouble(), scan.nextInt()));
        }
        SortingStudentsByID test1 = new SortingStudentsByID(idNumber);
        SortingStudentsByGPA test2 = new SortingStudentsByGPA(idNumber);
        System.out.println("Введите имя студента, которого надо найти:");
        TestSearch test3 = new TestSearch(idNumber, scan.next());
    }
}
