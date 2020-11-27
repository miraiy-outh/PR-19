package com.company.z1;

public class Client {
    String name;
    String inn;

    public Client(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
