package com.kodilla.hibernate.manytomany.facade.api;

public class DataProcessExceptions extends Exception {

    public static String ERR_READ_COMPANY = "Company name cannot be read.";
    public static String ERR_READ_EMPLOYEE = "Employee name cannot be read.";

    public DataProcessExceptions(String message) {
        super(message);
    }
}
