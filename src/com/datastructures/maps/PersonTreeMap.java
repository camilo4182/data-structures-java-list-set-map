package com.datastructures.maps;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.List;
import java.util.TreeMap;

/**
 * As in TreeSet, this implementation of Map stores the elements in a sorted way, ascendant or descendant, by using the
 * Comparable interface in the elements class.
 */
public class PersonTreeMap implements IPersonRepository {
    private final TreeMap<Integer, Person> treeMap;

    public PersonTreeMap() {
        treeMap = new TreeMap<>();
    }

    @Override
    public void save(Person person) {
        treeMap.put(person.getId(), person);
    }

    @Override
    public Person getPersonById(int id) {
        return treeMap.get(id);
    }

    @Override
    public void deletePersonById(int id) {
        treeMap.remove(id);
    }

    @Override
    public void deletePerson(Person person) {
        treeMap.remove(person.getId(), person);
    }

    @Override
    public List<Person> getAll() {
        return treeMap.values().stream().toList();
    }
}
