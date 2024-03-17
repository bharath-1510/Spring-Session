package org.accolite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("TestAnnotation")
public class TestAnnotationDl {


    @Autowired
    @Qualifier("workServicesImpl")
    EmployeeServices employeeServices;

    /*public TestAnnotationDl(@Qualifier("salaryServicesImpl") EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }*/
    public void sendprint() {
        employeeServices.print();
    }
}
