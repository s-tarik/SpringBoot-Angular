//package ma.intelcom.GestionDeProjet.controllers;
//
//import ma.intelcom.GestionDeProjet.models.Employee;
//import ma.intelcom.GestionDeProjet.services.EmployeeService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/employees")
//@CrossOrigin
//public class EmployeeController {
//
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//
//    @PostMapping
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return employeeService.createEmployee(employee);
//    }
//
//    @GetMapping("/{id}")
//
//    public Employee getEmployeeById(@PathVariable Long id){
//        return  employeeService.getEmployeeById(id);
//    }
//
//    @GetMapping
//
//    public List<Employee> getAllEmployees(){
//        return employeeService.getAllEmployees();
//    }
//
//    @PutMapping("/{id}")
//
//    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
//        employee.setId(id);
//        return employeeService.updateEmployee(id , employee);
//    }
//
//    @DeleteMapping("/{id}")
//
//    public void deleteEmployee(@PathVariable Long id){
//        employeeService.deleteEmployee(id);
//    }
//}
