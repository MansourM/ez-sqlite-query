package ir.masterz.mansour.ez.querybuilder.components;

public class Limit {

    private final String str_clause;

    public Limit(int limitCount, String previousQuery) {
        str_clause = previousQuery + " LIMIT " + limitCount;
    }

    public Limit(int limitCount, int offset, String previousQuery) {
        str_clause = previousQuery + " LIMIT " + limitCount + " OFFSET " + offset;
    }

    public String build() {
        return str_clause;
    }

}
