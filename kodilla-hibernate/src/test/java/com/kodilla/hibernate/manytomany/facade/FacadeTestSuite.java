package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
        facade.dataOfEmployee(employee1);
        facade.dataOfCompany(company1);
        facade.processCompany(company1,employee1);
        facade.dataOfEmployee(employee2);;
        facade.dataOfCompany(company2);
        facade.processCompany(company2,employee2);
        facade.dataOfEmployee(employee3);
        facade.dataOfCompany(company3);
        facade.processCompany(company3,employee3);
        facade.dataOfEmployee(employee4);
        facade.dataOfEmployee(employee5);
        facade.processCompany(company2,employee4);
        facade.processCompany(company3,employee5);

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        List<Employee> nameOfEmployee=employeeDao.lookingForEmployeeWithFragmentText("%am%");


        List<Company> nameOfComapany=companyDao.lookingForCompanyWithFragmentText("%uil%");

        Assert.assertEquals(2,nameOfEmployee.size());
        Assert.assertEquals(1,nameOfComapany.size());



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
