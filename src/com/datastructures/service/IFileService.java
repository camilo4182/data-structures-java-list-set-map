package com.datastructures.service;

import com.datastructures.model.Person;

public interface IFileService {
    public void readFile();
    public void saveOperation(Person person);
    public void getByIdOperation(int id);
    public void deleteByIdOperation(int id);
    public void deleteOperation(Person person);
}
