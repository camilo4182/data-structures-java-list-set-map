package com.datastructures.service;

import com.datastructures.model.Person;

import java.util.List;

public interface IPersonService {
    public void save(Person person);
    public Person getPersonById(int id);
    public void deletePersonById(int id);
    public void deletePerson(Person person);
    public List<Person> getAll();
}
