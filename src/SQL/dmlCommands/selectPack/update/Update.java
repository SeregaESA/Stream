package SQL.dmlCommands.selectPack.update;

public class Update {

// Применяется для изменения информации уже в существующих строках. РАботает только с одной табл.
// UPDATE table_name set column(s) = value(s) where condition(s);
// Пример: update users set last_name = 'Ermolaeva' where id = 6; - в табл. users установи last_name = 'Ermolaeva'
//         где id = 6
// Пример: update users set age = 34, lastName = 'user' where id > 6; установка в несколько строк
//
// UPDATE с SUBQUERY
// UPDATE table_name set column(s) = SUBQUERY(s) where column = SUBQUERY;
// Пример: update users set name = 'Кира' where car_id
//         in (select US.car_id from (select car_id where car_id in (6,7)) US);

}
