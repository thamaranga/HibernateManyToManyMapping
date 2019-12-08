package com.hasitha.manytomany.service;


import com.hasitha.manytomany.entity.Student;
import org.hibernate.HibernateException;

public interface StudentService {

    int addStudent(Student student) throws HibernateException;

}
