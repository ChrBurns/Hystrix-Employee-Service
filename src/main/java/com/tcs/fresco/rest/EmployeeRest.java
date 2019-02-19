package com.tcs.fresco.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.fresco.model.Employee;
import com.tcs.fresco.service.EmployeeService;


@RestController
@RequestMapping("/employees")
public class EmployeeRest {
	
    @Autowired
    EmployeeService empService;

}
