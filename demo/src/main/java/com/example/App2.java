package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class App2 {

    public static void main(String[] args) {

        Laptop l1=new Laptop();
    l1.setRam(16);
    l1.setBrand("DELL");
    l1.setModel("Windows");

        
        Employee e=new Employee();
        e.setEName("Sameeksha");
        e.setEid(2);
        e.setEtech("java");
        e.setLaptop(l1);
    
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(e);
        transaction.commit();

    }
}
