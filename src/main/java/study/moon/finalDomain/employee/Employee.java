package study.moon.finalDomain.employee;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.moon.finalDomain.accounting.Accounting;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    private String name;

    private String employeeNumber;

    @OneToMany(mappedBy = "employee")
    private List<Accounting> accountingList = new ArrayList<>();



    @Builder
    public Employee(Long id, String name, String employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }
}
