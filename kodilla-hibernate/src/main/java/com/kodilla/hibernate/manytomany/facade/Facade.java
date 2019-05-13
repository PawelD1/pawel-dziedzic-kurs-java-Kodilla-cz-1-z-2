package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;




@Service
public class Facade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    //Czy jest szansa wywwołania tych dwóch poniższych zakomentowanych funkcji (jedna czeka na dane drugiej i na odwrót)?
//    public Company processCompany(final String name, final String firstName, final String lastName)
//    {
//            Company company=new Company(name);
//            Employee employee=processEmployee(firstName, lastName, name);
//            company.getEmployees().add(employee);
//            companyDao.save(company);
//            return company;
//    }
//    public Employee processEmployee(final String firstName, final String lastName, String name)
//    {
//            Employee employee=new Employee(firstName, lastName);
//            Company company=processCompany(name, firstName, lastName);
//            employee.getCompanies().add(company);
//            employeeDao.save(employee);
//            return employee;
//    }
//    public Employee dataOfEmployee(Employee e) {
//        return new Employee(e.getFirstname(),e.getLastname());
//    }
//
//    public Company dataOfCompany(Company c) {
//        return new Company(c.getName());
//    }
//
//    public void processCompany(Company c, Employee e) {
//        Employee employee = dataOfEmployee(e);
//        c.getEmployees().add(employee);
//       // companyDao.save(c);
//    }
//
//    public void processEmployee(Employee e, Company c) {
//        Company company = dataOfCompany(c);
//        e.getCompanies().add(company);
//        //employeeDao.save(e);
//    }
}
