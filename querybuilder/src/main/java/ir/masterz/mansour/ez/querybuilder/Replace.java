package ir.masterz.mansour.ez.querybuilder;

import java.util.HashMap;
import java.util.Map;

import ir.masterz.dotamaster.db.MansourEZQueryBuilder.components.InsertValues;

public class Replace {

    private final String st_clause;
    private final Map<String, String> cv_map;

    Replace(String tableName) {
        this.st_clause = "REPLACE INTO " + tableName;
        cv_map = new HashMap<>();
    }

    public InsertValues name(String columnName) {
        return new InsertValues(columnName, st_clause, cv_map);
    }


}
