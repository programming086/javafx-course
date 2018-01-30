package ru.javabegin.training.fastjava2.javafx.objects;

public class Person {

    private String fio;
    private String phone;


    public Person(String fio, String phone) {
        this.fio = fio;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}

