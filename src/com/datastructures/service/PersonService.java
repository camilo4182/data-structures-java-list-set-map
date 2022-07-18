package com.datastructures.service;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.List;

public class PersonService implements IPersonService {
    private final IPersonRepository repository;

    public PersonService(IPersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Person person) {
        repository.save(person);
    }

    @Override
    public Person getPersonById(int id) {
        return repository.getPersonById(id);
    }

    @Override
    public void deletePersonById(int id) {
        repository.deletePersonById(id);
    }

    @Override
    public void deletePerson(Person person) {
        repository.deletePerson(person);
    }

    @Override
    public List<Person> getAll() {
        return repository.getAll();
    }
}
