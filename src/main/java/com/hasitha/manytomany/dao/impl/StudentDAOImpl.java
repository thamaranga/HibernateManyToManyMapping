package com.hasitha.manytomany.dao.impl;

import com.hasitha.manytomany.dao.StudentDAO;
import com.hasitha.manytomany.entity.Student;
import com.hasitha.manytomany.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAOImpl implements StudentDAO {


    @Override
    public int addStudent(Student student)  throws HibernateException{
        int result=-1;
        Transaction transaction=null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction=session.beginTransaction();
            result=(int)session.save(student);
            transaction.commit();
            System.out.println("Student is created  with Id::"+result);

        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("e "+e);
            throw e;
        }
        return result;
    }


}
