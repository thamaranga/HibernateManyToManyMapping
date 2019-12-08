package com.hasitha.manytomany.service;


import com.hasitha.manytomany.entity.Laptop;
import org.hibernate.HibernateException;

public interface LaptopService {

    int addLaptop(Laptop laptop) throws HibernateException;

}
