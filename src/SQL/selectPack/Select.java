package SQL.selectPack;

public class Select {

//  SELECT statement не меняет данные. Он просто их извлекает

//  Три фундаментальные концепции:
//    1. PROJECTION - выбор столбцов из таблицы по условиям запроса
//    2. SELECTION - выбор строк из таблицы по условиям запроса
//    3. JOINING - объединение таблиц. Если у нас таблицы связанны, то позволяет выводить полную информацию со всех табл.

// ----------------------------------------------------------------------------------
//  Базовый синтаксис (самый простой):
//  SELECT * FROM table; - SELECTION - выбрать
//                         * - все столбцы
//                         FROM - откуда
//                         table - название таблицы
// ---------------------------------------------------------------------------------
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
//  Выражения со строками
//  Конкатенация указанных столбцов в одну строку (смотреть команды для типа БД, могут быть разные). Можно производить
//  с разными типами колонок. При конкатенации значение null игнорируется
//  Пример: select concat(name, ' ', last_name, ' ', car_id) from users;
//  Пример: select
//             concat('My name is ', name, ' ','My lastName is ', last_name, ' ', car_id)
//          from users;
//
//  Alias - альтернативное имя для столбца или целого выражения
//  SELECT column(s) alias, expression(s) alias FROM table;
//  Пример: select
//          concat('My name is ', name, ' ','My lastName is ', last_name, ' ', car_id) pop
//          from users; (название этого выражения изменится на pop)
//  Пример: select name as n, last_name as LS from users; (выведи колонку name как n, колонку last_name как LS из
//                                                         табл. users)
//  Пример: select name as n, last_name as "LS rew" from users; (пишем в двойных ковычках, если исполь. пробел)
//
//----------------------------------------------------------------------------
//  SELECTION базовый синтаксис:
//  SELECT * |{DISTINCT column(s) alias, expression(s) alias} FROM table WHERE condition(s);
//             SELECT - выведи
//             * - из всех столбцов
//             |{DISTINCT column(s) alias, expression(s) alias} - или из тех, которые укажу
//             FROM table - из таблицы
//             WHERE - где
//             condition(s) - выполняются условия. В условиях можно писать любой оператор сравнения. Сравнивать
//                            можно с конкретными значениями, столбцами, строками, выражениями
//  Пример: SELECT name, last_name FROM user where salary = 10000; (Выведи колонки name и last_name из таблицы user
//                                                                  где зарплата равна 10000)
//  Пример: SELECT name, last_name FROM user where name = 'Natali'; в условиях может быть другой столбец или выражение
//  Пример: SELECT * FROM user WHERE last_name = concat(name, 'ov'); к окончании имени будет прибавляться 'ov'

//  BETWEEN - между. Предоставляет интервал от и до
//  Пример: SELECT name FROM user where salary BETWEEN 4000 and 10000; - Выведи столбец name из табл. user где
//                                                                       зарплата от 4000 до 10000
//  Пример: select last_name from user where start_date between '01.01.04' and '31.12.06';
//  Пример: select name from user where last_name between 'A' and 'C';

//  IN - в списке.
//  Пример: select * from user where age in (18, 20, 35); Выведи всю информацию из табл. user, где возраст находится
//                                                        в списке (18, 20, 35)
//  Пример: select * from user where name in ('Sergei', 'Natali');
//  Пример: select * from user where star_date in ('31.01.25', '01.02.26');

//  IS NULL - проверяет на NULL
//  Пример: select name, last_name from user where salary is null; Выведи имя и фамилию из табл. user где зарплата
//                                                                 null

//  LIKE - работает только с текстовым типом. Имеет два опреатора - % говорит,что вместо меня может быть любое
//  колличество символов и могут стоять в любом месте;  _ - говорит, что вместо меня может идти только один символ.
//  Могут комбинироваться вместе и разными колличествами
//  Пример: select * from user where name like 'S%'; Верни весь список из табл. user где имена начинаются на S и
//                                                   после S может идти любое колличество символов
//  Пример: select * from user where name like '%r'; тоже, но что бы имена заканчивались не r
//  Пример: select * from user where name like 'A%r'; тоже, но начало на А и конец r
//
//  Пример: select last_name from user where name like 'D_n'; где в имени между D и n может стоять только один любой
//                                                            символ
//  Пример: select last_name from user where name like 'ST\_%' escape '\'; escape '\' значит, что после \ нужно
//                                                                         прочитать следующий символ как обычный.

//  Логические операторы
//  AND - принимает true, если все условия вернули true (условий может быть сколько угодно)
//  Пример: select name from user where last_name like 'D%' and salary > 10000; где имя начинается на D и salary больше
//                                                                              10000
//  OR - true, если хотя бы одно условие true (условий может быть сколько угодно)
//  Пример: select * from user where name like '%F' or like '%er'; где имя заканчивается или на F или на er
//
//  NOT - меняет значение условия на противоположное
//  Пример: select * from user where not (name = 'Natali'); где имя не равно Natali

//  ORDER BY — необязательный элемент запроса, который отвечает за сортировку таблицы. По умолчанию сортировка
//  происходит по возрастанию для чисел и в алфавитном порядке для текстовых значений. Если нужна обратная сортировка,
//  то в конструкции ORDER BY после названия столбца надо добавить DESC. По образу компаратора.
//  Пример: select * from user order by name; отсортировать табл. user по name
//  Пример: select * from user order by name, salary;
//  Пример: select * from user order by name desc, salary;
//  Пример: select name, last_name from user order by 2; можем указать номер столбца из нашего селект листа
//
//---------------------------------------------------------------------------------------------------------------------
//
// JOIN - объеднение таблиц. Должна быть логическая связь между табл.
//
// INNER JOIN (NATURAL JOIN) - есть три вида: NATURAL JOIN, USING, ON.
// NATURAL JOIN - объединяет таблицы по одному или нескольким общем столбцам.
// SELECT column(s) FROM table_1 NATURAL JOIN table_2;
// Пример: select * from user INNER JOIN car; Выведи таблицу user и объедини с табл. car (связанны по id)
// Пример: select CA.model, US.name, car_id from user US INNER JOIN car CA; US и CA - это алисы наших табл. Мы можем
//         колонки указывать по этим алисам, но колонку по которой происходит объединение привязывать к одной табл.
//         нельзя
//
// USING - указываем по какому столбцу объединить таблицы
// SELECT column(s) FROM table_1 JOIN table_2 USING(column(s);
//                     USING(column(s) - в отличии от NATURAL JOIN в этом параметре мы указываем по какому столбцу
//                                       производить объединение (если у нас больше одного общего столбца)
// Пример: select * from user JOIN car USING (car_id); - Объедини табл. user и car по столбцу car_id
// Пример: select user.car_id, name user JOIN car USING (car_id); Если хотим вывести общий столбец, то нужно указыть из
//         какой табл. выводить (название табл. или её алиес).
//
// ON - самый нормальный.
// select column(s) from table_1 JOIN table_2 ON(column1 = column2);
//                     ON(column1 = column2) - указываем по каким колонкам нужно объединить, если их значения равны
// Пример: select * from user JOIN car ON(user.name = car.model); Объедини таблицы user и car по колонкам user.name
//         и car.model, если их значения равны
//
//--------------------------------------------------------------------------------------------------------------------
//
// Объединение нескольких табл.
//
// Пример: select * from user NATURAL JOIN car NATURAL JOIN region; Первым пройдёт объединение user и car, а затем
//         результат объединиться в region
// Пример: select * from user JOIN car USING(car_id) JOIN region USING(region_id);
//
//-------------------------------------------------------------------------------------------------------------------
//
// Объединение табл. с помощью неравенств
// select column(s) from table_1 JOIN table_2 ON(column1{знак неравенства}column2);
// Пример: select first_name from user U JOIN car C ON(U.car_id = C.car_id AND model != honda);
//                     AND model != honda - прописываем логический опертатор.
//
//--------------------------------------------------------------------------------------------------------------------
//
// Объединение по колонкам в одной табл.
// Пример: select U1.name, U2.name from user JOIN user U2 ON(U1.model_id = U2.user_id); SQL будет рассматривать эту
//                запись, как две разные таблицы (по alias)
//
//-------------------------------------------------------------------------------------------------------------------
//
// OUTER JOIN (LEFT OUTER JOIN, RIGHT OUTER JOIN, FULL OUTER JOIN) - объединяют табл. по заданному параметру и
// дополнительно выводят те данные, которые не подошли по параметрам
//
// LEFT OUTER JOIN
// select column(s) from table_1 LEFT OUTER JOIN table_2 ON (column1 = column2);
// Пример: select * from user LEFT OUTER JOIN car ON(user.name = car.model);Объедини таблицы user и car по колонкам
// user.name и car.model, если их значения равны и всех остальных из левой (user) табл.
//
// RIGHT OUTER JOIN
// select column(s) from table_1 RIGHT OUTER JOIN table_2 ON (column1 = column2); работает так же, но с правой табл.
//
// FULL OUTER JOIN
// select column(s) from table_1 FULL OUTER JOIN table_2 ON (column1 = column2); выводит табл по объединению и строки
// которые не вошли в условия
//
//------------------------------------------------------------------------------------------------------------------
//
//
}
