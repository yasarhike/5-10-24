package org.insta.content.service.story.querystructureinjector.address;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class AddressQueryStructureInjector {

    private static AddressQueryStructureInjector addressQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private AddressQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static AddressQueryStructureInjector getInstance() {
        return addressQueryStructureInjector == null ? new AddressQueryStructureInjector() : addressQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "address"));
    }
}
