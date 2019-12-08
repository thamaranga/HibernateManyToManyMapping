package com.hasitha.manytomany.service.impl;

import com.hasitha.manytomany.dao.impl.StudentDAOImpl;
import com.hasitha.manytomany.entity.Student;
import com.hasitha.manytomany.service.StudentService;
import org.hibernate.HibernateException;

public class StudentServiceImpl implements StudentService {
    @Override
    public int addStudent(Student student) throws HibernateException {
        return new StudentDAOImpl().addStudent(student);
    }


}
