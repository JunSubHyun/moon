package study.moon.finalDomain.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.moon.finalDomain.accounting.Accounting;

public interface AccountingRepository  extends JpaRepository<Accounting, Long>,AccountingRepositoryCustom , QuerydslPredicateExecutor<Accounting>, JpaSpecificationExecutor<Accounting> {


}
