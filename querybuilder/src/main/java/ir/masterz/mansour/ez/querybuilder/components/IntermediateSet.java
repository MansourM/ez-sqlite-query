package ir.masterz.mansour.ez.querybuilder.components;

public class IntermediateSet {

    private String str_clause;

    IntermediateSet(String previousQuery) {
        str_clause = previousQuery;
    }

    public Set set(String columnName) {
        str_clause += ", ";
        return new Set(columnName, str_clause);
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
