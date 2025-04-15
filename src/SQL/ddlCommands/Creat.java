package SQL.ddlCommands;

public class Creat {

// Creat - создание табл.
// Правила:
// - Каждая колонка содержит опред. тип данных
// - Можно дополнить правилами для каждой колонки
//
// creat table schema.table organization heap
// (column_name datatype default axpr, ...);
// create table students (
// student_id integer,
// name varchar(20),
// start_date date,
// avg_score decimal(6,2) default 5.2
// );
//
// Создание табл. с использованием subguery
// creat table table as subguery;
// Пример: create table new_users as (select name, last_name, lastName from users); создастся табл с колонками из users
//
}
