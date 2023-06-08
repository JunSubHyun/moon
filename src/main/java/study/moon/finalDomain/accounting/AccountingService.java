package study.moon.finalDomain.accounting;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.moon.finalDomain.accounting.dto.AccountingRequest;
import study.moon.finalDomain.accounting.dto.AccountingResponse;
import study.moon.finalDomain.accounting.repository.AccountingRepository;
import study.moon.finalDomain.employee.Employee;
import study.moon.finalDomain.employee.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountingService {

    final AccountingRepository accountingRepository;

    final EmployeeRepository employeeRepository;

    public List<AccountingResponse> list(){

        List<AccountingResponse> list = accountingRepository.list();

        return list;
    }

    public Long save(AccountingRequest accountingRequest){

        Employee employee = employeeRepository.findById(accountingRequest.getEmployeeId()).get();
        Accounting accounting = Accounting.builder()
                .money(accountingRequest.getMoney())
                .state(State.deposit)
                .employee(employee)
                .build();
        return accountingRepository.save(accounting).getId();
    }

    public AccountingResponse read(Long id){
        Accounting accounting = accountingRepository.findById(id).get();
        Employee employee = employeeRepository.findById(accounting.getEmployee().getId()).get();

        AccountingResponse accountingResponse = new AccountingResponse();
        accountingResponse.setEmployeeName(employee.getName());
        accountingResponse.setMoney(accounting.getMoney());
        accountingResponse.setEmployeeNumber(employee.getEmployeeNumber());
        accountingResponse.setState(accounting.getState());

        return accountingResponse;
    }

}
