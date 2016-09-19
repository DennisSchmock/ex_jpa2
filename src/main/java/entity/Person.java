/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dennis
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person implements Serializable {

    @OneToOne
    private Grade grade;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fName;
    private String lName;
    private int age;
    private boolean isMarried;
    
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Person superVisor;
      
    @OneToMany(mappedBy = "superVisor",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<Person> supervised = new ArrayList<>();
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;

    public Person() {
    }

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public void addSuperVised(Person person){
        this.supervised.add(person);
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the isMarried
     */
    public boolean isIsMarried() {
        return isMarried;
    }

    /**
     * @param isMarried the isMarried to set
     */
    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    /**
     * @return the superVisor
     */
    public Person getSuperVisor() {
        return superVisor;
    }

    /**
     * @param superVisor the superVisor to set
     */
    public void setSuperVisor(Person superVisor) {
        this.superVisor = superVisor;
    }

    /**
     * @return the superVisors
     */
    public List<Person> getSuperVisors() {
        return supervised;
    }

    /**
     * @param superVisors the superVisors to set
     */
    public void setSuperVisors(List<Person> superVisors) {
        this.supervised = superVisors;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    @Override
    public String toString(){
        String tempString = "";
        tempString += "Name: " + this.fName + " " + this.lName;
        return tempString;
     }

    /**
     * @return the grade
     */
    public Grade getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    
    
}
