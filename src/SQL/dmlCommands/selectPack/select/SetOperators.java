package SQL.dmlCommands.selectPack.select;

public class SetOperators {

// Операторы, которые работают с множеством. Количество столбцов в обоих select табл долны быть одинаково. Если в одном
// select применяем несколько set операторов, то они выполняются с лева направо. Есл хотим изменить приоритет, то
// нужно испльзовать скобки
//
// UNION - объдиняет два аутпут множества в одно простым присоединением и удаляет дубликаты. Колличество возвращ.
// столбцов должно быть одиноково. Название столбцов берется из первого select
// Пример: select * from cars where model like 'h%' - выведет один select под другим
//         union select *from cars where model like 't%';
// Пример: select * from cars where model like 'h%'
//         union select * from cars where model like 't%' order by series; order by пишем только после второго select
//
// INTERSECT - возвращает только общие строки, удаляя дубликаты и сортируя результат
// Пример: select model, series from cars where model like 'h%'
//         intersect
//         select model, series from cars where model like 'h%';
//
// EXCEPT - возращает только те строки, которые есть в первом множестве, но нет во втором, удаляя при этом дубликаты и
//          сортируя результат.
// Пример: select * from cars where model like '%'
//         except
//         select * from cars where model like 'h%';
//
//
//
//
//
//
//
//
//
//
//
}
