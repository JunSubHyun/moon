package study.moon.finalDomain.accounting.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.moon.finalDomain.accounting.State;
import study.moon.finalDomain.employee.Employee;

import javax.persistence.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountingRequest {

    private int money;

    private State state;

    private Long employeeId;


}
