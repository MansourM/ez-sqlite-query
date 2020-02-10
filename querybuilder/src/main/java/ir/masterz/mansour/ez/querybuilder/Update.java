package ir.masterz.mansour.ez.querybuilder;

import ir.masterz.dotamaster.db.MansourEZQueryBuilder.components.Set;

public class Update {

    private final String str_clause;

    Update(String tableName) {
        str_clause = "UPDATE " + tableName + " SET ";
    }

    public Set set(String columnName) {
        return new Set(columnName, str_clause);
    }

}
