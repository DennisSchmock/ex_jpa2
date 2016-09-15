/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dennis
 */
@Entity
public class Employee extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
   
    
    private int soSecNr;
    private float wage;
    private String taxClass;

    public Employee() {
    }

    public Employee(int soSecNr, float wage, String taxClass, String fName, String lName, int age) {
        super(fName, lName, age);
        this.soSecNr = soSecNr;
        this.wage = wage;
        this.taxClass = taxClass;
    }
    
    
    


    /**
     * @return the soSecNr
     */
    public int getSoSecNr() {
        return soSecNr;
    }

    /**
     * @param soSecNr the soSecNr to set
     */
    public void setSoSecNr(int soSecNr) {
        this.soSecNr = soSecNr;
    }

    /**
     * @return the wage
     */
    public float getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(float wage) {
        this.wage = wage;
    }

    /**
     * @return the taxClass
     */
    public String getTaxClass() {
        return taxClass;
    }

    /**
     * @param taxClass the taxClass to set
     */
    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

  @Override
    public String toString(){
        String tempString = super.toString();
        tempString += "SoSecNr: " + this.soSecNr + " Wage: " + this.wage;
        return tempString;
    }
    
}
