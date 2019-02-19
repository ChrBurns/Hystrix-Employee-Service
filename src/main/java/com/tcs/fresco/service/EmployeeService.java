package com.tcs.fresco.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.tcs.fresco.model.Employee;


@Service
public class EmployeeService {
	public static final String COMMAND_KEY = "EmpDetails";
	public static final String COMMAND_KEY_2 = "EmpDetailsBank";

    private static final Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
    static {
    	empMap.put(1, new Employee(1,"Arun", "B.E", "AP", 1,null));
    	empMap.put(2, new Employee(2,"Ajay", "M.A", "AP", 2,null));
    	empMap.put(3, new Employee(3,"Ben", "B.Sc", "TN", 4,null));
    	empMap.put(4, new Employee(4,"Balu", "B.Com", "TN",6, null));
    	empMap.put(5, new Employee(5,"chetan", "B.Tech", "KA",7, null));
    }

    private String getBankName(int id) {
    	switch(id) {
    	case 1:
    		return "BOI";
    	case 2: 
    		return "Canara Bank";
    	case 3:
    		return "India Bank";
    	case 4:
    		return "HDFC Bank";
    	case 5:
    		return "IDBI Bank";
    	default :
    		return "";
    	}
    		
    }
    
   
}
