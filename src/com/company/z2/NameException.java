package com.company.z2;

public class NameException extends Exception{
    private String name;
    public String getName(){return name;}
    public NameException(String message, String str){

        super(message);
        name = str;
    }
}
