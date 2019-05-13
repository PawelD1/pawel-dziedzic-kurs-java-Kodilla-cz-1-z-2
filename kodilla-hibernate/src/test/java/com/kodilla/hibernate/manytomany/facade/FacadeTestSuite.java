package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class FacadeTestSuite {
    @Autowired
    Facade facade;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;
    @Test
    public void testLookingForCompanyWithFragmentText()
    {
        Company company1=new Company("Software");
        Employee employee1=new Employee("John","Smith");
        Company company2=new Company("Building");
        Employee employee2=new Employee("Johnny","Tram");
        Company company3=new Company("Energa");
        Employee employee3=new Employee("Jim","Zajc");
        Employee employee4=new Employee("Adam","Kong");
        Employee employee5=new Employee("Domen","Oamen");
        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);
        company3.getEmployees().add(employee3);
        company3.getEmployees().add(employee4);
        company2.getEmployees().add(employee5);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company3);
        employee4.getCompanies().add(company3);
        employee5.getCompanies().add(company2);


        //When

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        List<Employee> nameOfEmployee=employeeDao.lookingForEmployeeWithFragmentText("am");


        List<Company> nameOfCompany=companyDao.lookingForCompanyWithFragmentText("uil");

        //Then

        Assert.assertEquals(2,nameOfEmployee.size());
        Assert.assertEquals(1,nameOfCompany.size());



        //CleanUp
        try {
            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);
        } catch (Exception e) {
            //do nothing
        }

    }
}
