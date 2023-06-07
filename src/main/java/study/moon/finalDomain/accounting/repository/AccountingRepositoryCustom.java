package study.moon.finalDomain.accounting.repository;

import study.moon.finalDomain.accounting.dto.AccountingResponse;

import java.util.List;

public interface AccountingRepositoryCustom {

    List<AccountingResponse> list();
}
