package org.accolite.services.impl;

import org.accolite.services.EmployeeServices;
import org.springframework.stereotype.Component;

@Component()
public class SalaryServicesImpl implements EmployeeServices {
    @Override
    public void print() {
        System.out.println("Salary Service Implemented");
    }
}
