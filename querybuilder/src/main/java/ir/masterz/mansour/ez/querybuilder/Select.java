package ir.masterz.mansour.ez.querybuilder;

import ir.masterz.mansour.ez.querybuilder.components.From;

public class Select {

    private final String str_clause;

    Select(String... selects) {
        StringBuilder sb_select = new StringBuilder("SELECT ");
        boolean first = true;
        for (String select : selects) {
            if (first) {
                sb_select.append(select);
                first = false;
            } else
                sb_select.append(", ").append(select);
        }
        str_clause = sb_select.toString();
    }

    Select(String selectClause) {
        str_clause = selectClause;
    }

    public From from(String table_name) {
        return new From(table_name, str_clause);
    }

    public From rawFrom(String fromClause) {
        return new From(str_clause + " " + fromClause);
    }

}
