//package ma.intelcom.GestionDeProjet.services;
//
//import ma.intelcom.GestionDeProjet.models.Employee;
//import ma.intelcom.GestionDeProjet.repositories.EmployeeRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//@Service
//public class EmployeeService {
//
//
//
//    private final EmployeeRepository employeeRepository;
//
//    public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//
//    public Employee createEmployee(Employee employee){
//        return employeeRepository.save(employee);
//    }
//
//
//    public Employee getEmployeeById (Long id){
//        return employeeRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Employee non trouvé par l'id: " +id));
//    }
//
//
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//
//
//    public Employee updateEmployee(Long id , Employee employee) {
//        return employeeRepository.save(employee);
//    }
//
//
//    public void deleteEmployee(Long id) {
//        employeeRepository.deleteById(id);
//    }
//}
