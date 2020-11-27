package com.company.z2;

import java.util.ArrayList;

public class SearchStudent {
    public ArrayList<Person> idNumber = new ArrayList<>();

    public SearchStudent(ArrayList<Person> idNumber) {
        this.idNumber = idNumber;
    }
    public int linSearch(String name) throws NameException{
        int id = -1;
        for (int i = 0; i < idNumber.size(); i++) {
            if ((name.equals(idNumber.get(i).getName()))) {
               id = i;
            }
        }
        if (id == -1) {
            throw new NameException("Данного студента нет в базе", name);
        }
        else {
            return id;
        }
    }
}
