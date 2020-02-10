package ir.masterz.mansour.ez.querybuilder.components;

import java.util.Map;

public class InsertValues {

    private final Map<String, String> cv_map;
    private final String name;
    private final String previousQuery;

    public InsertValues(String columnName, String previousQuery, Map<String, String> cv_map) {
        this.name = columnName;
        this.previousQuery = previousQuery;
        this.cv_map = cv_map;
    }

    public IntermediateInsertValues value(String value) {
        cv_map.put(name, value);
        return new IntermediateInsertValues(cv_map, previousQuery);
    }

    public IntermediateInsertValues value(int value) {
        cv_map.put(name, String.valueOf(value));
        return new IntermediateInsertValues(cv_map, previousQuery);
    }


}
