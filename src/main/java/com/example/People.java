package com.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(PersonType... people) {
        Arrays.asList(people);
    }

    public void add(PersonType type) {
        personList.add(type);
    }

    public void remove(PersonType type) {
        personList.remove(type);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> type) {
        personList.addAll((Collection<? extends PersonType>) type);
    }

    public PersonType findById(long id) {
        for (PersonType personType : personList) {
            if (personType.getId().equals(id)) {
                return personType;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }
}
