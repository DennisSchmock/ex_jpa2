/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dennis
 */
@Entity
public class Student extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
   

    private int matNr;

    public Student() {
    }

    public Student(int matNr, String fName, String lName, int age) {
        super(fName, lName, age);
        this.matNr = matNr;
    }

    @Temporal(TemporalType.DATE)
    private Date matDate;


    @Override
    public String toString() {
        String tempString = "Student\n" + super.toString();
        tempString += "matNr: " + matNr + " matDate: " + matDate;
        return tempString;
    }

}
