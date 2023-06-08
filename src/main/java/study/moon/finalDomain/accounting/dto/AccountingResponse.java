package study.moon.finalDomain.accounting.dto;

import lombok.Data;
import study.moon.finalDomain.accounting.State;

@Data
public class AccountingResponse {

    private Long accountId;

    private int money;

    private String employeeName;

    private String employeeNumber;

    private State state;


}
