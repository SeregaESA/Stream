package SQL.selectPack.functions;

public class GroupFunctions {

// Работают с группами
//
// COUNT({* | {DISTINCT|ALL}expression}) - считате колличество, возвращает число - колличество в какой то группе
// Пример: select COUNT(*) from user; посчитает сколько строк в табл. user
// Пример: select COUNT(*) from user where age > 30; посчитает сколько строк в табл. user по условию
// Пример: select COUNT(email) from user; вернёт колличество строк в столбце email за исключением null
//
// SUM({DISTINCT|ALL}expression}) - принимает в парраметры только число. При сложении игнорирует null
// Пример: select SUM(age) from user; вернет сумму всех age
// Пример: select SUM(DISTINCT age) from user; вернет сумму всех уникальных age
//
// AVG({DISTINCT|ALL}expression}) - принимает в парраметры только число. Вернёт среднее арифметическое
// Пример: select AVG(age) from user; вернёт средний возраст
//
// MIN({DISTINCT|ALL}expression}) - может работать с числами, датами, тестом
// MAX({DISTINCT|ALL}expression}) - может работать с числами, датами, тестом
// Пример: select MIN(age), MAX(age) from user;
//
//----------------------------------------------------------------------------------------------------
//
// select * | {DISTINCT column(s) alias, expression(s) alias, group_f-on(s)(col | expr alias,}
// from table where condition(s) group by{col(s) | expr(s)}
// order by {col(s) | expr(s) | numeric position}
// {ASC | DESC} {NULL first | LAST}
//
// Пример: select userName, count(*) from user group by userAge order by 1, 2; Выведи все userName и колличество строк
//
// Группировка по нескольким парраметрам
// Пример: select department_id, job_id, count(*) from employees
// group by department_id, job_id
// order by department_id;
//
// GROUP BY WITH HAVING - Отсеивает группы по условию (как where). Применяется при group by.
// select * | {DISTINCT column(s) alias, expression(s) alias, group_f-on(s)(col | expr alias,}
// from table where condition(s) group by{col(s) | expr(s)}
// HAVING group_condition(s) - указывает условие для группировка.
// order by {col(s) | expr(s) | numeric position}
// {ASC | DESC} {NULL first | LAST}
//
// Пример:
// select department_id, count(*) from employees - с начала выполниться сортировка по where length(first_name) > 4,
// where length(first_name) > 4                    затем идёт группировка по group by department_id, затем остаются
// group by department_id                          те, у которых HAVING count(*) > 3, после чего происходит
// HAVING count(*) > 3                             сортировка order by department_id
// order by department_id
//

}
