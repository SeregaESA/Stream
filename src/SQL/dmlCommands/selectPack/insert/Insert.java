package SQL.dmlCommands.selectPack.insert;

public class Insert {

// Вставляет новые строки (одну или несколько) в табл
//
// INSERT INTO table_name column(s) VALUES(value(s)) - встась в таблицу такие то значения
// Пример: insert into cars (id, model, series) value (10, 'exceed', 6); - лучше указывать колонки
// Пример: insert into cars (id, model) value (11, 'bmw'); - не указывая столбец, на его месте будет null
// Пример: insert into cars (id, model, series) value (12, upper('bmw'), 9); - можно применять функции
//
//---------------------------------------------------------------------------------------------------------
//
// INSERT с использованием SUBQUERY - тип данных столбцов должен быть одинаковый
// INSERT INTO table_name column(s) SUBQUERY;
// Пример: insert into new_cars (id, model, series) - табл. new_cars заполнится данными из таблицы cars
//         (SELECT * from cars where id < 5);
//
}
