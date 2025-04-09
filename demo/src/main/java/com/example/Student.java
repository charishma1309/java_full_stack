package com.example;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
    private String sName;
    @Id
    private int rollNo;
    private int sAge;
    public String getSName() {
        return this.sName;
    }
    public void setSName(String sName) {  this.sName = sName; }
    public int getRollNo() {return this.rollNo;}
    public void setRollNo(int rollNo) {this.rollNo = rollNo;}
    public int getSAge() {return this.sAge;}
    public void setSAge(int sAge) {
        this.sAge = sAge;
    }
    @Override
    public String toString() {
        return "{" +
            " sName='" + getSName() + "'" +
            ", rollNo='" + getRollNo() + "'" +
            ", sAge='" + getSAge() + "'" +
            "}";
    }

}
