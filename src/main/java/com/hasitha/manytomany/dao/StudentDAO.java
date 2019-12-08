package com.hasitha.manytomany.dao;

import com.hasitha.manytomany.entity.Student;
import org.hibernate.HibernateException;

public interface StudentDAO {

    int addStudent(Student student) throws HibernateException;

}
