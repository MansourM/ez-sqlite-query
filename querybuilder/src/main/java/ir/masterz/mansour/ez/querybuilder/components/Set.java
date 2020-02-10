package ir.masterz.mansour.ez.querybuilder.components;

public class Set {

    private String str_clause;

    public Set(String columnName, String previousQuery) {
        str_clause = previousQuery + columnName;
    }

    public IntermediateSet to(int newValue) {
        str_clause += " = " + "'" + newValue + "'";
        return new IntermediateSet(str_clause);
    }

    public IntermediateSet to(String newValue) {
        str_clause += " = " + "'" + newValue + "'";
        return new IntermediateSet(str_clause);
    }

}
