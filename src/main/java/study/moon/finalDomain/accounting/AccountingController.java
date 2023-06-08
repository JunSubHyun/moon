package study.moon.finalDomain.accounting;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import study.moon.finalDomain.accounting.dto.AccountingRequest;
import study.moon.finalDomain.accounting.dto.AccountingResponse;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AccountingController {

    final AccountingService accountingService;

    @PostMapping("/insert")
    public String save(@ModelAttribute AccountingRequest accountingRequest){
        Long id = accountingService.save(accountingRequest);
        return "redirect:/read/"+id;
    }

    @GetMapping("/write")
    public String writeForm(){
        return "write";
    }

    @GetMapping("/read/{id}")
    public String read(@PathVariable Long id, Model model){
        model.addAttribute("data",accountingService.read(id));

        return "read";
    }


}


