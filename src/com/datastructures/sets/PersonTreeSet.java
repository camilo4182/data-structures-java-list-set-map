package com.datastructures.sets;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.List;
import java.util.TreeSet;

/**
 * Implementation of NavigableSet which extends SortedSet. This stores the elements in a sorted way, ascendant or descendant,
 * by the Comparable interface implementation in the elements class.
 */
public class PersonTreeSet implements IPersonRepository {

    private final TreeSet<Person> treeSet;

    public PersonTreeSet() {
        treeSet = new TreeSet<>();
    }

    @Override
    public void save(Person person) {
        treeSet.add(person);
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public void deletePersonById(int id) {

    }

    @Override
    public void deletePerson(Person person) {

    }

    @Override
    public List<Person> getAll() {
        return null;
    }
}
