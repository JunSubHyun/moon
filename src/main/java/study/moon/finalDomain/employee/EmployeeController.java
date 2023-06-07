package study.moon.finalDomain.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/index")
    public String allList(Model model){
        List<Employee> list = employeeService.list();
        model.addAttribute("list",list);
        return "index";
    }

}
