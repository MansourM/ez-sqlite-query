package ir.masterz.mansour.ez.querybuilder.components;

import java.util.Map;

public class IntermediateInsertValues {

    private final Map<String, String> cv_map;
    private final String previousQuery;

    IntermediateInsertValues(Map<String, String> cv_map, String previousQuery) {
        this.cv_map = cv_map;
        this.previousQuery = previousQuery;
    }

    public InsertValues name(String columnName) {
        return new InsertValues(columnName, previousQuery, cv_map);
    }


    public String build() {

        StringBuilder sb_names = new StringBuilder(previousQuery + "(");
        StringBuilder sb_values = new StringBuilder(" VALUES (");

        boolean first = true;
        for (String key : cv_map.keySet()) {

            if (first)
                first = false;
            else {
                sb_names.append(",");
                sb_values.append(",");
            }

            sb_names.append(" ").append(key);
            sb_values.append(" '").append(cv_map.get(key)).append("'");
        }
        sb_names.append(" )");
        sb_values.append(" )");

        return sb_names.append(sb_values).toString();
    }

}
