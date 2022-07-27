package com.datastructures.maps;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.HashMap;
import java.util.List;

/**
 * Implementation of Map interface.
 * Stores the elements in key-value pairs, for which keys are calculated using the hashCode method. Same objects will always
 * return the same hash, but it's also possible that different objects may return the same hash, this situation is a collision.
 * HashMap allows duplicated values, but only one key per object or a list of different objects with the same key.
 * it also allows values to be null, but only one key can be null.
 * It's not synchronized.
 */
public class PersonHashMap implements IPersonRepository {
    private final HashMap<Integer, Person> hashMap;

    public PersonHashMap() {
        hashMap = new HashMap<>();
    }

    @Override
    public void save(Person person) {
        hashMap.put(person.getId(), person);
    }

    @Override
    public Person getPersonById(int id) {
        return hashMap.get(id);
    }

    @Override
    public void deletePersonById(int id) {
        hashMap.remove(id);
    }

    @Override
    public void deletePerson(Person person) {
        hashMap.remove(person.getId(), person);
    }

    @Override
    public List<Person> getAll() {
        return hashMap.values().stream().toList();
    }
}
