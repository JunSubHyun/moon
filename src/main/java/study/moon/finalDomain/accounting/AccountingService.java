package study.moon.finalDomain.accounting;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountingService {

    final AccountingRepository accountingRepository;

    public List<AccountingResponse> list(){

        List<AccountingResponse> list = accountingRepository.list();

        return list;
    }




}
