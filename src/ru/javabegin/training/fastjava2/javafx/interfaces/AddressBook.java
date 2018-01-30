package ru.javabegin.training.fastjava2.javafx.interfaces;

import ru.javabegin.training.fastjava2.javafx.objects.Person;

public interface AddressBook {

    // добавить запись
    void add(Person person);

    // внести измененные значения (подтвердить измененные данные)
    void update(Person person);

    // удалить запись
    void delete(Person person);

}
