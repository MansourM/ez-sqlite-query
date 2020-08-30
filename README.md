# Mansour-EZ-Query-Builder
this is an unfinished side project ;D

# Gradle
implementation 'com.github.MansourM:ez-sqlite-query:0.3.1'

# Here are some examples

        private static final String TAG = "test_activity";
        String query;

        query = new QueryBuilder()
                .select(
                        DB.HeroTable.COLUMN_NAME_ID,
                        DB.HeroTable.COLUMN_NAME_NAME,
                        DB.HeroTable.COLUMN_NAME_LOCALIZED_NAME,
                        DB.HeroTable.COLUMN_NAME_IMAGE,
                        DB.HeroTable.COLUMN_NAME_PORTRAIT,
                        DB.HeroTable.COLUMN_NAME_ICON,
                        DB.HeroTable.COLUMN_NAME_COLOR
                )
                .from(DB.HeroTable.TABLE_NAME)
                .orderBy(DB.HeroTable.COLUMN_NAME_NAME, OrderBy.ASCENDING)
                .build();

        Log.d(TAG, query);


        query = new QueryBuilder()
                .select("*")
                .from(DB.HeroTable.TABLE_NAME)
                .where(DB.HeroTable.COLUMN_NAME_ID).isEqual(12)
                .and(DB.HeroTable.COLUMN_NAME_ID).notEqual(13)
                .orderBy(DB.HeroTable.COLUMN_NAME_NAME, OrderBy.ASCENDING)
                .limit(10)
                .build();

        Log.d(TAG, query);

        query = new QueryBuilder()
                .select("*")
                .from(DB.HeroTable.TABLE_NAME)
                .where(DB.HeroTable.COLUMN_NAME_ID).isEqual(12)
                .or(DB.HeroTable.COLUMN_NAME_ID).notEqual(13)
                .orderBy(DB.HeroTable.COLUMN_NAME_NAME, OrderBy.DESCENDING)
                .limit(10, 10)
                .build();

        Log.d(TAG, query);

        query = new QueryBuilder()
                .update(DB.HeroTable.TABLE_NAME)
                .set(DB.HeroTable.COLUMN_NAME_NAME).to("test1")
                .set(DB.HeroTable.COLUMN_NAME_ICON).to("test2")
                .where(DB.HeroTable.COLUMN_NAME_ID).isEqual(12)
                .or(DB.HeroTable.COLUMN_NAME_ID).notEqual(13)
                .orderBy(DB.HeroTable.COLUMN_NAME_NAME, OrderBy.DESCENDING)
                .limit(1)
                .build();

        Log.d(TAG, query);

        query = new QueryBuilder()
                .deleteFrom(DB.HeroTable.TABLE_NAME)
                .where(DB.HeroTable.COLUMN_NAME_ID).isEqual(12)
                .or(DB.HeroTable.COLUMN_NAME_ID).notEqual(13)
                .orderBy(DB.HeroTable.COLUMN_NAME_NAME, OrderBy.DESCENDING)
                .limit(1)
                .build();

        Log.d(TAG, query);


        query = new QueryBuilder()
                .insertInto(DB.HeroTable.TABLE_NAME)
                .name("name1").value(1)
                .build();

        Log.d(TAG, query);

        query = new QueryBuilder()
                .insertInto(DB.HeroTable.TABLE_NAME)
                .name("name1").value(1)
                .name("name2").value("2")
                .name("name3").value(3)
                .build();

        Log.d(TAG, query);

        query = new QueryBuilder()
                .replaceInto(DB.HeroTable.TABLE_NAME)
                .name("name1").value(1)
                .build();

        Log.d(TAG, query);


        query = new QueryBuilder()
                .replaceInto(DB.HeroTable.TABLE_NAME)
                .name("name1").value(1)
                .name("name2").value("2")
                .name("name3").value(3)
                .build();
                
        Log.d(TAG, query);
