package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repo.EmployeeRepo;

@Service
public class EmployeeService {
@Autowired
EmployeeRepo er;
 public Employee saveinfo(Employee ee)
 {
	 return er.save(ee);
 }
 public List<Employee> showinfo()
 {
	 return er.findAll();
 }
}