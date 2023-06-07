package study.moon.finalDomain.accounting;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import study.moon.finalDomain.accounting.dto.AccountingResponse;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AccountingController {

    final AccountingService accountingService;

    @GetMapping("/home")
    public List<AccountingResponse> home(){
        List<AccountingResponse> list = accountingService.list();
        return list;
    }

}


