package com.datastructures.linear;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.List;
import java.util.Vector;

public class PersonVector implements IPersonRepository {
    private final List<Person> vector;

    public PersonVector() {
        vector = new Vector<>();
    }

    @Override
    public void save(Person person) {
        vector.add(person);
    }

    @Override
    public Person getPersonById(int id) {
        return vector.get(id - 1);
    }

    @Override
    public void deletePersonById(int id) {
        vector.remove(id - 1);
    }

    @Override
    public void deletePerson(Person person) {
        vector.remove(person);
    }

    @Override
    public List<Person> getAll() {
        return vector;
    }
}
