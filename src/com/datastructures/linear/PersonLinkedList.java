package com.datastructures.linear;

import com.datastructures.model.Person;
import com.datastructures.repository.IPersonRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * It implements a doubly linked list, so it has no need to allocate a lot of memory for elements since they are connected
 * through references to the next and previous one.
 * That makes it efficient for data manipulation such as insertion and deletion, because it doesn't have to reallocate
 * the elements to fill the gap if one element was deleted. But it's nor efficient for searching since we have to traverse
 * through the list until we reach the requested element.
 */
public class PersonLinkedList implements IPersonRepository {
    private final List<Person> linkedList;

    public PersonLinkedList() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void save(Person person) {
        linkedList.add(person);
    }

    @Override
    public Person getPersonById(int id) {
        return linkedList.get(id - 1);
    }

    @Override
    public void deletePersonById(int id) {
        linkedList.remove(id - 1);
    }

    @Override
    public void deletePerson(Person person) {
        linkedList.remove(person);
    }

    @Override
    public List<Person> getAll() {
        return linkedList;
    }
}
