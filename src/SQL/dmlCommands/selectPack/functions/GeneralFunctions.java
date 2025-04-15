package SQL.dmlCommands.selectPack.functions;

public class GeneralFunctions {
 //
 // Функции, которые работают с null. Реализация функций завасит от типа СУБД
 //
 // IFNULL(value, ifnull); Если value не null, вернёт value. Если null, вернёт ifnull
 // Пример: select ifnull(12, 13) from dual; Вывод 12
 // Пример: select ifnull(null, 13) from dual; Вывод 13
 // Пример: select name, ifnull(last_name, 'not last_name') from users;
 //
 // NULLIF(value1, value2); Возвращает null, если value1 и value2 равны и возвращает value1, если не равны
 // Пример: select nullif(12,12) from dual; Вывод null
 // Пример: select nullif(12,122) from dual; Вывод 12
 //
 // COALESCE(value1, value2, ..... valueN) - вернёт первое значение, которое не null
 // Пример: select coalesce(null,12,12) from dual; Вывод 12
 //
}
