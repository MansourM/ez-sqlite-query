package ir.masterz.mansour.ez.querybuilder;

import ir.masterz.dotamaster.db.MansourEZQueryBuilder.components.Condition;
import ir.masterz.dotamaster.db.MansourEZQueryBuilder.components.IntermediateCondition;
import ir.masterz.dotamaster.db.MansourEZQueryBuilder.components.Limit;
import ir.masterz.dotamaster.db.MansourEZQueryBuilder.components.OrderBy;

public class Delete {

    private String str_clause;

    Delete(String tableName) {
        str_clause = "DELETE FROM " + tableName;
    }

    public Condition where(String columnName) {
        return new Condition(columnName, str_clause + " WHERE ");
    }

    public IntermediateCondition rawWhere(String whereClause) {
        str_clause += " " + whereClause;
        return new IntermediateCondition(str_clause);
    }

    public OrderBy orderBy(String columnName, String order) {
        return new OrderBy(columnName, order, str_clause);
    }

    public Limit limit(int limitCount, int offset) {
        return new Limit(limitCount, offset, str_clause);
    }

    public Limit limit(int limitCount) {
        return new Limit(limitCount, str_clause);
    }

    public String build() {
        return str_clause;
    }



}
