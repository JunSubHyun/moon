package study.moon.finalDomain.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.moon.finalDomain.employee.dto.EmployeeRequest;
import study.moon.finalDomain.employee.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Long saveEmployee(EmployeeRequest employeeRequest){
        return employeeRepository.save(employeeRequest.toEntity()).getId();
    }

    public List<Employee> list(){
        return employeeRepository.findAll();
    }
}
