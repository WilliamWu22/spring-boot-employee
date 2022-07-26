package com.rest.springbootemployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping()
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        return employeeRepository.findEmployeeById(id);
    }

    @GetMapping(params = "gender")
    public List<Employee> findEmployeeByGender(@RequestParam String gender){
        return employeeRepository.findEmployeeByGender(gender);
    }
}
