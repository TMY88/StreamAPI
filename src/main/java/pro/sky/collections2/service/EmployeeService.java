package pro.sky.collections2.service;

import pro.sky.collections2.Employee;

import java.util.Map;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);

    Map<String, Employee> getAllEmployees();
}
