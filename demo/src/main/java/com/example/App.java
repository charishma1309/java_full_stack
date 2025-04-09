package com.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
    public static void main(String[] args) {
        Student s1=null;
        // Student s1=new Student();
        // s1.setSName("Sameeksha");
        // s1.setRollNo(2);
        // s1.setSAge(22);
        Configuration configuration=new Configuration();
        configuration.addAnnotatedClass(Student.class);
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sFactory=configuration.buildSessionFactory();
        Session session=sFactory.openSession();
        Transaction transaction=session.beginTransaction();

        s1=session.get(Student.class, 2);

        session.remove(s1);

        transaction.commit();
      
        session.close();
        sFactory.close();
    }
}

