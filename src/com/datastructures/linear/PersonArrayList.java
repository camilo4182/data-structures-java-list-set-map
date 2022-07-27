package com.datastructures.linear;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a static Object array Object[], so it has to create another one with a doubled capacity (size) when the number of elements
 * reaches the 'load factor', which is 0.75 by default.
 * It's index-based, and thus is efficient for searching a particular element, but not for insertion or deletion.
 */
public class PersonArrayList implements IPersonRepository {
    private final List<Person> arrayList;

    public PersonArrayList() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void save(Person person) {
        arrayList.add(person);
    }

    @Override
    public Person getPersonById(int id) {
        return arrayList.get(id - 1);
    }

    @Override
    public void deletePersonById(int id) {
        arrayList.remove(id - 1);
    }

    @Override
    public void deletePerson(Person person) {
        arrayList.remove(person);
    }

    @Override
    public List<Person> getAll() {
        return arrayList;
    }
}
