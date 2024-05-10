package org.insta.content.service.story.querystructureinjector.account;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class AccountQueryStructureInjector {

    private static AccountQueryStructureInjector accountQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private AccountQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static AccountQueryStructureInjector getInstance() {
        return accountQueryStructureInjector == null ? new AccountQueryStructureInjector() : accountQueryStructureInjector;
    }

    public String getAccountDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "account"));
    }
}
