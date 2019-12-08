package com.hasitha.manytomany;

import com.hasitha.manytomany.entity.Laptop;
import com.hasitha.manytomany.entity.Student;
import com.hasitha.manytomany.service.LaptopService;
import com.hasitha.manytomany.service.StudentService;
import com.hasitha.manytomany.service.impl.LaptopServiceImpl;
import com.hasitha.manytomany.service.impl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int result=-1;


        try {

            LaptopService laptopService= new LaptopServiceImpl();
            StudentService studentService= new StudentServiceImpl();


            Student student1= new Student();
            student1.setName("Hasitha");
            student1.setMarks(90);
            result=studentService.addStudent(student1);



            if(result>0){
                System.out.println("student1 successfully saved with ID "+result);
            }else{
                System.out.println("Error occured while saving student1");
            }



            Student student2= new Student();
            student2.setName("Thamaranga");
            student2.setMarks(80);
            result=studentService.addStudent(student2);



            if(result>0){
                System.out.println("student successfully saved with ID "+result);
            }else{
                System.out.println("Error occured while saving student");
            }


            Laptop laptop1= new Laptop();
            laptop1.setName("Lenovo 120");
            laptop1.getStudent().add(student1);
            laptop1.getStudent().add(student2);
            result=laptopService.addLaptop(laptop1);

            if(result>0){
                System.out.println("laptop1 successfully saved with ID "+result);
            }else{
                System.out.println("Error occured while saving laptop1");
            }

            Laptop laptop2= new Laptop();
            laptop2.setName("HP 630");
            laptop2.getStudent().add(student1);
            laptop2.getStudent().add(student2);
            result=laptopService.addLaptop(laptop2);

            if(result>0){
                System.out.println("laptop2 successfully saved with ID "+result);
            }else{
                System.out.println("Error occured while saving laptop2");
            }










        } catch (Exception e) {

            System.out.println("e "+e.getMessage());
        }









    }
}
