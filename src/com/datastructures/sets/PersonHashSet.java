package com.datastructures.sets;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Implements the Set interface. It doesn't allow duplicated elements and is not ordered (doesn't keep the insertion order)
 * Stores uniquely the elements with the hashCode and permits null values.
 */
public class PersonHashSet implements IPersonRepository {

    private final HashSet<Person> hashSet;

    public PersonHashSet() {
        hashSet = new HashSet<>();
    }

    @Override
    public void save(Person person) {
        hashSet.add(person);
    }

    @Override
    public Person getPersonById(int id) {
        for (Person person : hashSet) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void deletePersonById(int id) {
        hashSet.removeIf(person -> person.getId() == id);
    }

    @Override
    public void deletePerson(Person person) {
        hashSet.remove(person);
    }

    @Override
    public List<Person> getAll() {
        return hashSet.stream().toList();
    }
}
