package study.moon.finalDomain.employee.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.moon.finalDomain.employee.Employee;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EmployeeRequest {

    private String name;

    private String employeeNumber;

    public EmployeeRequest(String name, String employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public Employee toEntity(){
        return Employee.builder()
                .employeeNumber(employeeNumber)
                .name(name)
                .build();
    }

}
