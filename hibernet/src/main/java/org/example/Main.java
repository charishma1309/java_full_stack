package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Student s1=new Student();
        s1.setName("Charishma");
        s1.setRollno(1);
        s1.setAge(21);
        Configuration conf=new Configuration();
        conf.addAnnotatedClass(org.example.Student.class);
        conf.configure("hibernate.cfg.xml");
        SessionFactory sf=conf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(s1);
        tx.commit();
        System.out.println(s1);

    }
}