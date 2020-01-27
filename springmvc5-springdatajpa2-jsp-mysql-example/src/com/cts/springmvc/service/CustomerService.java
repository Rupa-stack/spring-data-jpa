package com.cts.springmvc.service;

import java.util.List;

import com.cts.springmvc.entity.Customer;
import com.cts.springmvc.exception.ResourceNotFoundException;

public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId) throws ResourceNotFoundException;

    public void deleteCustomer(int theId) throws ResourceNotFoundException;
}