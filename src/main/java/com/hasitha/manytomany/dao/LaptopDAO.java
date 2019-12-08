package com.hasitha.manytomany.dao;

import com.hasitha.manytomany.entity.Laptop;
import org.hibernate.HibernateException;

public interface LaptopDAO {

    int addLaptop(Laptop laptop) throws HibernateException;

}
