package com.datastructures.linear;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class PersonLinkedList implements IPersonRepository {
    private final List<Person> linkedList;

    public PersonLinkedList() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void save(Person person) {
        linkedList.add(person);
    }

    @Override
    public Person getPersonById(int id) {
        return linkedList.get(id - 1);
    }

    @Override
    public void deletePersonById(int id) {
        linkedList.remove(id - 1);
    }

    @Override
    public void deletePerson(Person person) {
        linkedList.remove(person);
    }

    @Override
    public List<Person> getAll() {
        return linkedList;
    }
}
