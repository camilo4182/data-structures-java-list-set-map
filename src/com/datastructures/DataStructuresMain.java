package com.datastructures;

import com.datastructures.linear.PersonArrayList;
import com.datastructures.linear.PersonLinkedList;
import com.datastructures.linear.PersonStack;
import com.datastructures.linear.PersonVector;
import com.datastructures.maps.PersonHashMap;
import com.datastructures.maps.PersonHashTable;
import com.datastructures.maps.PersonLinkedHashMap;
import com.datastructures.maps.PersonTreeMap;
import com.datastructures.service.FileService;
import com.datastructures.sets.PersonHashSet;
import com.datastructures.sets.PersonLinkedHashSet;
import com.datastructures.sets.PersonTreeSet;

import java.util.Scanner;

public class DataStructuresMain {
    static FileService fileService = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose data structure: ");
        System.out.println("\t0: Array List");
        System.out.println("\t1: Linked List");
        System.out.println("\t2: Stack");
        System.out.println("\t3: Vector");
        System.out.println("\t4: Hashset");
        System.out.println("\t5: Linked Hashset");
        System.out.println("\t6: TreeSet");
        System.out.println("\t7: HashTable");
        System.out.println("\t8: HashMap");
        System.out.println("\t9: Linked HashMap");
        System.out.println("\t10: TreeMap");
        System.out.print("Response: ");
        int method = scanner.nextInt();
        switch (method) {
            case 0 -> arrayListOperations();
            case 1 -> linkedListOperations();
            case 2 -> stackOperations();
            case 3 -> vectorOperations();
            case 4 -> hashSetOperations();
            case 5 -> linkedHashSetOperations();
            case 6 -> treeSetOperations();
            case 7 -> hashTableOperations();
            case 8 -> hashMapOperations();
            case 9 -> linkedHashMapOperations();
            case 10 -> treeMapOperations();
        }
    }

    /* LINEAR STRUCTURES */
    public static void arrayListOperations() {
        System.out.println("=============== Array List ===============");
        fileService = new FileService(new PersonArrayList());
        fileService.readFile();
        System.out.println();
        fileService.getByIdOperation(1);
        fileService.getByIdOperation(6000);
        System.out.println();
        fileService.deleteByIdOperation(1);
        fileService.deleteByIdOperation(5999);
        fileService.closeStream();
        System.out.println("=============== Array List ===============");
    }

    public static void linkedListOperations() {
        System.out.println("=============== Linked List ===============");
        fileService = new FileService(new PersonLinkedList());
        fileService.readFile();
        System.out.println();
        fileService.getByIdOperation(1);
        fileService.getByIdOperation(6000);
        System.out.println();
        fileService.deleteByIdOperation(1);
        fileService.deleteByIdOperation(5999);
        fileService.closeStream();
        System.out.println("=============== Linked List ===============");
    }

    public static void stackOperations() {
        System.out.println("=============== Stack ===============");
        fileService = new FileService(new PersonStack());
        fileService.readFile();
        System.out.println();
        // TO-DO STACK
        System.out.println("=============== Stack ===============");
    }

    public static void vectorOperations() {
        System.out.println("=============== Vector ===============");
        fileService = new FileService(new PersonVector());
        fileService.readFile();
        System.out.println();
        // TO-DO VECTOR
        System.out.println("=============== Vector ===============");
    }

    /* SETS STRUCTURES */
    public static void hashSetOperations() {
        System.out.println("=============== HASH SET ===============");
        fileService = new FileService(new PersonHashSet());
        fileService.readFile();
        System.out.println();
        fileService.getByIdOperation(1);
        fileService.getByIdOperation(6000);
        System.out.println();
        fileService.deleteByIdOperation(1);
        fileService.deleteByIdOperation(5999);
        fileService.closeStream();
        System.out.println("=============== HASH SET ===============");
    }

    public static void linkedHashSetOperations() {
        System.out.println("=============== LINKED HASH SET ===============");
        fileService = new FileService(new PersonLinkedHashSet());
        fileService.readFile();
        System.out.println();
        fileService.getByIdOperation(1);
        fileService.getByIdOperation(6000);
        System.out.println();
        fileService.deleteByIdOperation(1);
        fileService.deleteByIdOperation(5999);
        fileService.closeStream();
        System.out.println("=============== LINKED HASH SET ===============");
    }

    public static void treeSetOperations() {
        System.out.println("=============== TREE SET ===============");
        fileService = new FileService(new PersonTreeSet());
        fileService.readFile();
        System.out.println();
        fileService.getByIdOperation(1);
        fileService.getByIdOperation(6000);
        System.out.println();
        fileService.deleteByIdOperation(1);
        fileService.deleteByIdOperation(5999);
        fileService.closeStream();
        System.out.println("=============== TREE SET ===============");
    }

    /* MAPS STRUCTURES */
    public static void hashTableOperations() {
        System.out.println("=============== HASH TABLE ===============");
        fileService = new FileService(new PersonHashTable());
        fileService.readFile();
        System.out.println();
        fileService.getByIdOperation(1);
        fileService.getByIdOperation(6000);
        System.out.println();
        fileService.deleteByIdOperation(1);
        fileService.deleteByIdOperation(5999);
        fileService.closeStream();
        System.out.println("=============== HASH TABLE ===============");
    }

    public static void hashMapOperations() {
        System.out.println("=============== HASH MAP ===============");
        fileService = new FileService(new PersonHashMap());
        fileService.readFile();
        System.out.println();
        fileService.getByIdOperation(1);
        fileService.getByIdOperation(6000);
        System.out.println();
        fileService.deleteByIdOperation(1);
        fileService.deleteByIdOperation(5999);
        fileService.closeStream();
        System.out.println("=============== HASH MAP ===============");
    }

    public static void linkedHashMapOperations() {
        System.out.println("=============== LINKED HASH MAP ===============");
        fileService = new FileService(new PersonLinkedHashMap());
        fileService.readFile();
        System.out.println();
        fileService.getByIdOperation(1);
        fileService.getByIdOperation(6000);
        System.out.println();
        fileService.deleteByIdOperation(1);
        fileService.deleteByIdOperation(5999);
        fileService.closeStream();
        System.out.println("=============== LINKED HASH MAP ===============");
    }

    public static void treeMapOperations() {
        System.out.println("=============== TREE MAP ===============");
        fileService = new FileService(new PersonTreeMap());
        fileService.readFile();
        System.out.println();
        fileService.getByIdOperation(1);
        fileService.getByIdOperation(6000);
        System.out.println();
        fileService.deleteByIdOperation(1);
        fileService.deleteByIdOperation(5999);
        fileService.closeStream();
        System.out.println("=============== TREE MAP ===============");
    }
}
