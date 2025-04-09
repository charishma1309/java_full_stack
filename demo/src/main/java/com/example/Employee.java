package com.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity(name="EMPLOYEE") // to chnage table name
public class Employee {
    @Id
    private int Eid;
    @Column(name="Name")  // To change column name
    private String EName;
    @Transient           // to not include this column in the table
    private String Etech;
    private Laptop laptop;



    public int getEid() {
        return this.Eid;
    }

    public void setEid(int Eid) {
        this.Eid = Eid;
    }

    public String getEName() {
        return this.EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public String getEtech() {
        return this.Etech;
    }

    public void setEtech(String Etech) {
        this.Etech = Etech;
    }

    public Laptop getLaptop() {
        return this.laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "{" +
            " Eid='" + getEid() + "'" +
            ", EName='" + getEName() + "'" +
            ", Etech='" + getEtech() + "'" +
            ", laptop='" + getLaptop() + "'" +
            "}";
    }
   

}
