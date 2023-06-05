package study.moon.finalDomain.accounting;

import lombok.Data;
import study.moon.finalDomain.employee.Employee;

@Data
public class Accounting {

    private Long id;

    private Employee employee;

    public Accounting(Long id, Employee employee) {
        this.id = id;
        this.employee = employee;
    }
}
