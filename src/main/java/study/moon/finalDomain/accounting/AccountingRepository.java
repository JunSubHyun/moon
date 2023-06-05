package study.moon.finalDomain.accounting;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountingRepository {

    List<AccountingResponse> list();

}
