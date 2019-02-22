package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public List<Company> findCompanyByAnyLetters(String company) throws DataProcessExceptions {
        LOGGER.info("Searching company by name.");
        List<Company> companies = companyDao.retrieveWithAnyLettersName(company);
        if (companies.isEmpty()){
                LOGGER.error(DataProcessExceptions.ERR_READ_COMPANY);
                throw new DataProcessExceptions(DataProcessExceptions.ERR_READ_COMPANY);
            }
        LOGGER.info("Company which contains letters '"+company+"' has been found.");
        return companies;
    }

    public List<Employee> findEmployeeByAnyLetters(String employee) throws DataProcessExceptions {
        LOGGER.info("Searching employee by name.");
        List<Employee> employees = employeeDao.retrieveWithAnyLettersLastName(employee);
        if (employees.isEmpty()){
            LOGGER.error(DataProcessExceptions.ERR_READ_EMPLOYEE);
            throw new DataProcessExceptions(DataProcessExceptions.ERR_READ_EMPLOYEE);
        }
        LOGGER.info("Employee which contains letters '"+employee+"' has been found.");
        return employees;
    }

}
