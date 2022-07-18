package com.datastructures.service;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class FileService implements IFileService {
    private final BufferedReader reader;
    private IPersonRepository repository;
    private final IPersonService service;

    private final DecimalFormat df;

    public FileService(IPersonRepository repository) {
        try {
            this.reader = new BufferedReader(new FileReader("src/resources/MOCK_DATA.csv"));
            this.repository = repository;
            this.service = new PersonService(this.repository);
            this.df = new DecimalFormat("0.00");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public IPersonRepository getRepository() {
        return repository;
    }

    public void setRepository(IPersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void readFile() {
        String line;
        try {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split(",");
                Person person = new Person(Integer.parseInt(attributes[0]), attributes[1], attributes[2], attributes[3], attributes[4], attributes[5],
                        attributes[6], attributes[7], attributes[8], attributes[9]);
                saveOperation(person);
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveOperation(Person person) {
        long initialTime = System.nanoTime();
        this.service.save(person);
        long finalTime = System.nanoTime();
        double total = (double) finalTime - initialTime;
        System.out.println("Save operation: " + df.format(total) + " ns");
    }

    @Override
    public void getByIdOperation(int id) {
        long initialTime = System.nanoTime();
        service.getPersonById(id);
        long finalTime = System.nanoTime();
        double total = (double) finalTime - initialTime;
        System.out.println("Get by id " + id + " operation: " + df.format(total) + " ns");
    }

    @Override
    public void deleteByIdOperation(int id) {
        long initialTime = System.nanoTime();
        service.deletePersonById(id);
        long finalTime = System.nanoTime();
        double total = (double) finalTime - initialTime;
        System.out.println("Delete id " + id + " operation: " + df.format(total) + " ns");
    }

    @Override
    public void deleteOperation(Person person) {
        long initialTime = System.nanoTime();
        service.deletePerson(person);
        long finalTime = System.nanoTime();
        double total = (double) finalTime - initialTime;
        System.out.println("Delete " + person.getFirst_name() + " operation: " + df.format(total) + " ns");
    }

    public void closeStream() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
