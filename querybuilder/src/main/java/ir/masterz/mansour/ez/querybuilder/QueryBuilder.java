package ir.masterz.mansour.ez.querybuilder;

//ez query for SQLite

public class QueryBuilder {

    public QueryBuilder() {
    }

    //https://www.sqlitetutorial.net/sqlite-select/
    public Select select(String... selects) {
        return new Select(selects);
    }

    public Select rawSelect(String selectClause) {
        return new Select(selectClause);
    }

    public Update update(String tableName) {
        return new Update(tableName);
    }

    public Delete deleteFrom(String tableName) {
        return new Delete(tableName);
    }

    public Insert insertInto(String tableName) {
        return new Insert(tableName);
    }

    public Replace replaceInto(String tableName) {
        return new Replace(tableName);
    }

    //yet to be Coded:
    //JOINs, LIKE (search helpers), TRANSACTION
    // >, < , <=, >=

}
