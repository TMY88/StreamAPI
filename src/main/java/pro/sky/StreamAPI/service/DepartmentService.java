package pro.sky.StreamAPI.service;

import pro.sky.StreamAPI.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee getEmployeeMaxSalary(Integer departmentId);
    Employee getEmployeeMinSalary(Integer departmentId);
    Map<Integer, List<Employee>> getGroupsByDepartment(Integer departmentId);
}
