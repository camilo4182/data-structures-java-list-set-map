package com.datastructures.repository;

import com.datastructures.model.Person;

import java.util.List;
import java.util.Optional;

public interface IPersonRepository {
    public void save(Person person);
    public Person getPersonById(int id);
    public void deletePersonById(int id);
    public void deletePerson(Person person);
    public List<Person> getAll();
}
