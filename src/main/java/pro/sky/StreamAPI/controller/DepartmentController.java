package pro.sky.StreamAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.StreamAPI.Employee;
import pro.sky.StreamAPI.service.DepartmentService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")

public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee getEmployeeMaxSalary(@RequestParam("departmentId") Integer departmentId) {
        return departmentService.getEmployeeMaxSalary(departmentId);
    }
    @GetMapping("/min-salary")
    public Employee getEmployeeMinSalary(@RequestParam("departmentId") Integer departmentId) {
        return departmentService.getEmployeeMinSalary(departmentId);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> getGroupsByDepartment(@RequestParam(name = "departmentId", required = false) Integer departmentId) {
        return departmentService.getGroupsByDepartment(departmentId);
    }

}

