package com.datastructures.maps;

import com.datastructures.linear.PersonLinkedList;
import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.LinkedHashMap;
import java.util.List;

public class PersonLinkedHashMap implements IPersonRepository {
    private final LinkedHashMap<Integer, Person> linkedHashMap;

    public PersonLinkedHashMap() {
        linkedHashMap = new LinkedHashMap<>();
    }

    @Override
    public void save(Person person) {
        linkedHashMap.put(person.getId(), person);
    }

    @Override
    public Person getPersonById(int id) {
        return linkedHashMap.get(id);
    }

    @Override
    public void deletePersonById(int id) {
        linkedHashMap.remove(id);
    }

    @Override
    public void deletePerson(Person person) {
        linkedHashMap.remove(person.getId(), person);
    }

    @Override
    public List<Person> getAll() {
        return linkedHashMap.values().stream().toList();
    }
}
