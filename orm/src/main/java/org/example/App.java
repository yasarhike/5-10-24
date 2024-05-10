package org.example;


import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

    DataConfigContainer dataConfigContainer = new DataConfigContainer();
    dataConfigContainer.setTableName("user");

    List<Column> a =new ArrayList<>();
    a.add(new Column("id", "user"));
    a.add(new Column("nu", "df"));
    dataConfigContainer.setColumnList(a);
    List<WhereClause> b = new ArrayList<>();

    WhereClause whereClause = new WhereClause("user", "and");
    b.add(whereClause);
        b.add(new WhereClause("yasar"));
        dataConfigContainer.setWhereClauses(b);
        System.out.println(InsertQueryBuilder.getInstance().buildInsertQuery(dataConfigContainer));
        System.out.println(QueryGenerator.getInstance().getWhereQuery(b));
        System.out.println(UpdateQueryBuilder.getInstance().getUpdateQuery(dataConfigContainer));
        System.out.println(SelectQueryBuilder.getInstance().buildSelectQuery(dataConfigContainer));
    }
}
