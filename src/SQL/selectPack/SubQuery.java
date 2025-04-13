package SQL.selectPack;

public class SubQuery {

// SubQuery (SINGLE ROW, MULTIPLE ROW, SCALAR) - это запрос в запросе (select в select)
// Пример: select name from user where age > (select AVG(age) from user); Выведи имена из табл user, где age меньше
//         среднего значения age в табл user
//
// SINGLE ROW - возвращает одну строку
// Пример: select name from user where salary < (select MAX(salary)/5 from user);
//
// MULTIPLE ROW -
// Пример:
//
// CORRELATE SubQuery
//
//
//
}
