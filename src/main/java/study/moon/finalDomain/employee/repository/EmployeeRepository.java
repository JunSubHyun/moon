package study.moon.finalDomain.employee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.moon.finalDomain.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, EmployeeRepositoryCustom, QuerydslPredicateExecutor<Employee>, JpaSpecificationExecutor<Employee> {


}
