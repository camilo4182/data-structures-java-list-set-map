package com.datastructures.sets;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.LinkedHashSet;
import java.util.List;

/**
 * Another implementation of Set interface. This does maintain the insertion order.
 */
public class PersonLinkedHashSet implements IPersonRepository {
    private final LinkedHashSet<Person> linkedHashSet;

    public PersonLinkedHashSet() {
        linkedHashSet = new LinkedHashSet<>();
    }

    @Override
    public void save(Person person) {
        linkedHashSet.add(person);
    }

    @Override
    public Person getPersonById(int id) {
        for (Person person : linkedHashSet) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void deletePersonById(int id) {
        linkedHashSet.removeIf(person -> person.getId() == id);
    }

    @Override
    public void deletePerson(Person person) {
        linkedHashSet.remove(person);
    }

    @Override
    public List<Person> getAll() {
        return linkedHashSet.stream().toList();
    }
}
