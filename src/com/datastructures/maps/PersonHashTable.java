package com.datastructures.maps;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.Hashtable;
import java.util.List;

/**
 * Works almost the same way as HashMap, but this doesn't allow null values, neither null keys.
 * It's a synchronized implementation.
 */
public class PersonHashTable implements IPersonRepository {
    private final Hashtable<Integer, Person> hashtable;

    public PersonHashTable() {
        hashtable = new Hashtable<>();
    }

    @Override
    public void save(Person person) {
        hashtable.put(person.getId(), person);
    }

    @Override
    public Person getPersonById(int id) {
        return hashtable.get(id);
    }

    @Override
    public void deletePersonById(int id) {
        hashtable.remove(id);
    }

    @Override
    public void deletePerson(Person person) {
        hashtable.remove(person.getId(), person);
    }

    @Override
    public List<Person> getAll() {
        return hashtable.values().stream().toList();
    }
}
