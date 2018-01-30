package ru.javabegin.training.fastjava2.javafx.interfaces.impls;

import ru.javabegin.training.fastjava2.javafx.interfaces.AddressBook;
import ru.javabegin.training.fastjava2.javafx.objects.Person;

import java.util.ArrayList;

// класс реализовывает интерфейс с помощью коллекции
public class CollectionAddressBook implements AddressBook {

    private ArrayList<Person> personList = new ArrayList<Person>();

    @Override
    public void add(Person person) {personList.add(person);}

    @Override
    // для коллекции не используется, но пригодится для случая, когда данные хранятся в БД и пр.
    public void update(Person person) {
        // т.к. коллекция и является хранилищем - то ничего обновлять не нужно
        // если бы данные хранились в БД или файле - в этом методе нужно было бы обновить соотв. запись
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

}
