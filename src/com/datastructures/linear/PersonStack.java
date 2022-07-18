package com.datastructures.linear;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.List;
import java.util.Stack;

public class PersonStack implements IPersonRepository {
    private final Stack<Person> stack;

    public PersonStack() {
        stack = new Stack<>();
    }

    @Override
    public void save(Person person) {
        stack.push(person);
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
