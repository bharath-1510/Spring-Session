package org.accolite.services.impl;

import org.accolite.services.EmployeeServices;
import org.springframework.stereotype.Service;

@Service
public class WorkServicesImpl implements EmployeeServices {
    @Override
    public void print() {
        System.out.println("Work Services Implemented");
    }
}
