package com.datastructures.maps;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.HashMap;
import java.util.List;

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
