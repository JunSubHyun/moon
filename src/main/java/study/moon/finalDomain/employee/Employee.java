package study.moon.finalDomain.employee;

import lombok.Data;

@Data
public class Employee {

    private Long id;

    private String name;

    private String employeeNumber;

    public Employee(){

        this.id = id;
        this.name = name;

    }



}
