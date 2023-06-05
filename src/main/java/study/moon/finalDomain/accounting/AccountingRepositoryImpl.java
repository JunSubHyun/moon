package study.moon.finalDomain.accounting;

import java.util.List;

public class AccountingRepositoryImpl implements AccountingRepository{
    @Override
    public List<AccountingResponse> list() {

        AccountingResponse accountingResponse = new AccountingResponse(1L,1L,"test");

        List<AccountingResponse> list = null;



        return list;

    }
}
