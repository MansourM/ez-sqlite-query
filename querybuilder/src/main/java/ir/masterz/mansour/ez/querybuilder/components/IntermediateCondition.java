package ir.masterz.mansour.ez.querybuilder.components;

public class IntermediateCondition {

    private String str_clause;

    public IntermediateCondition(String previousQuery) {
        str_clause = previousQuery;
    }

    public Condition and(String columnName) {
        str_clause += " AND ";
        return new Condition(columnName, str_clause);
    }

    public Condition or(String columnName) {
        str_clause += " OR ";
        return new Condition(columnName, str_clause);
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
