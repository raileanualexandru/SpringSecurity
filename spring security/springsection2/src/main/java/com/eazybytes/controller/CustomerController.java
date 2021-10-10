package com.eazybytes.controller;


import com.eazybytes.model.Customer;
import com.eazybytes.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public String addCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/addCustomer";
    }

}
