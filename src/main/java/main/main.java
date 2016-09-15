/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Employee;
import entity.Person;
import entity.Student;
import facade.Facade;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dennis
 */
public class main {

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("pu");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        Person student1 = new Student(1, "Dennis", "Schmock", 20);
        Person emp1 = new Employee(1000, 122, "High", "Hanseman", "Lugter", 12);

        Facade fa = new Facade(emf);
        fa.addPerson(student1);
        fa.addPerson(emp1);
        student1.setSuperVisor(emp1);
        fa.editPerson(emp1);
        fa.editPerson(student1);
        
    }
}
