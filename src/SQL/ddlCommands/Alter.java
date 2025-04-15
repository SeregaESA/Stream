package SQL.ddlCommands;

public class Alter {

// Alter table - добавление табл.
// Alter table table_name add(column_name data_type default axpr)
// Пример: alter table students add (course integer default 1);
//
// Изменение существующего столбца. Только типом данных, не конфликтующих с существующими данными
// Alter table table_name modify(column_name data_type default axpr)
// Пример: alter table students modify student_id int default 1;
//
// Удаление колонки
// Alter table table_name drop column column_name;
// Пример: alter table students drop course;
//
// Изменение названия колонки
// Alter table table_name rename column_name1 to column_name2;
// Пример: alter table students rename column name2 to user_name;
//
// READ ONLY - таблица доступна только для select
// Alter table READ ONLY;
//
}
