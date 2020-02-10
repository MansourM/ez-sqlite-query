package ir.masterz.mansour.ez.querybuilder.components;

public class Condition {

    private String str_clause;

    public Condition(String columnName, String previousQuery) {
        str_clause = previousQuery + columnName;
    }

    public IntermediateCondition isEqual(int value) {
        str_clause += " = " + "'" + value + "'";
        return new IntermediateCondition(str_clause);
    }

    public IntermediateCondition isEqual(String value) {
        str_clause += " = " + "'" + value + "'";
        return new IntermediateCondition(str_clause);
    }

    public IntermediateCondition notEqual(int value) {
        str_clause += " != " + "'" + value + "'";
        return new IntermediateCondition(str_clause);
    }

    public IntermediateCondition notEqual(String value) {
        str_clause += " != " + "'" + value + "'";
        return new IntermediateCondition(str_clause);
    }


    public IntermediateCondition isNull() {
        str_clause += " IS NULL";
        return new IntermediateCondition(str_clause);
    }

    public IntermediateCondition notNull() {
        str_clause += " IS NOT NULL";
        return new IntermediateCondition(str_clause);
    }

}
