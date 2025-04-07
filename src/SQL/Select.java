package SQL;

public class Select {

//  SELECT statement не меняет данные. Он просто их извлекает

//  Три фундаментальные концепции:
//    1. PROJECTION - выбор столбцов из таблицы по условиям запроса
//    2. SELECTION - выбор строк из таблицы по условиям запроса
//    3. JOINING - объединение таблиц. Если у нас таблицы связанны, то позволяет выводить полную информацию со всех табл.


//  Базовый синтаксис (самый простой):
//  SELECT * FROM table; - SELECTION - выбрать
//                         * - все столбцы
//                         FROM - откуда
//                         table - название таблицы

//  PROJECTION синтаксис:
//  SELECT column(s) FROM table;
//  Пример: SELECT name FROM user (выбрать колонку name из табл. user)
//  Пример: SELECT name, last_name FROM user (выбрать колонки name и last_name из табл. user). Через запятую идет
//  перечисление нужных колонок
//
//  DISTINCT - при добавлении слова DISTINCT выведутся только уникальные значения указанных столбцов, дубликаты
//             выводится не будут.
//  SELECT DISTINCT column(s) FROM table;
//  Пример: SELECT DISTINCT name FROM user (выбрать только уникальные значения столбца name из табл. user)
//  Пример: SELECT DISTINCT name, last_name FROM user
//
//  Expression in select list - выражение в селект листе
//  SELECT column(s), expression(s) FROM table;
//  Пример: SELECT age*2 FROM user (высести колоку age умноженную на 2 из табл. user)
//  Пример: SELECT age*2 + salary FROM user (высести колоку age умноженную на 2 и прибавить значения
//                                           колонки salary из табл. user)
//  Пример: SELECT name, age*2 FROM user (вывести колонку name и колонку age умноженную на 2 из табл user)
//
//


}
