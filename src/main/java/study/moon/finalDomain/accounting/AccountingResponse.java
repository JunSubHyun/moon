package study.moon.finalDomain.accounting;

public class AccountingResponse {

    private Long accountId;

    private Long employeeId;

    private String name;


    public AccountingResponse(Long accountId, Long employeeId, String name) {
        this.accountId = accountId;
        this.employeeId = employeeId;
        this.name = name;
    }
}
