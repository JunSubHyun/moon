package study.moon.finalDomain.accounting;

import lombok.*;
import study.moon.finalDomain.employee.Employee;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Accounting implements AccountingState{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accounting_id")
    private Long id;

    private int money;

    @Enumerated(EnumType.STRING)
    private State state;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="employee_id")
    private Employee employee;

    @Builder
    public Accounting(Long id,int money, State state,Employee employee) {
        this.id = id;
        this.money = money;
        this.state = state;
        this.employee = employee;
    }

    @Override
    public void sing(Accounting accounting) {
        this.state = State.sign;
    }

    @Override
    public void back(Accounting accounting) {
        this.state = State.back;
    }
}
