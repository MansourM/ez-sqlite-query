package ir.masterz.mansour.ez.querybuilder.components;

public class OrderBy {

    private String str_clause;
    public static final String ASCENDING = "ASC";
    public static final String DESCENDING = "DESC";

    public OrderBy(String columnName, String order, String previousQuery) {
        str_clause = previousQuery + " ORDER BY " + columnName + " " + order;
    }

    public OrderBy orderBy(String columnName, String order) {
        str_clause += ", " + columnName + " " + order;
        return this;
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
