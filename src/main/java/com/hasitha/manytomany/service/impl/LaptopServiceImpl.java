package com.hasitha.manytomany.service.impl;

import com.hasitha.manytomany.dao.impl.LaptopDAOImpl;
import com.hasitha.manytomany.entity.Laptop;
import com.hasitha.manytomany.service.LaptopService;
import org.hibernate.HibernateException;

public class LaptopServiceImpl implements LaptopService {
    @Override
    public int addLaptop(Laptop laptop) throws HibernateException {
        return new LaptopDAOImpl().addLaptop(laptop);
    }


}
