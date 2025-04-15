package SQL.dmlCommands.selectPack.functions;

public class ConditionFunctions {
//
// Функции условий
//
// CASE expr WHEN comp1 THEN iftrue1 - Обязательные параметры. Идёт сравнение expr с comp1 и вывод iftrue1, если равны
//           WHEN compN THEN iftrueN   Всё выражение закрывается словом END
//           ELSE iffalse
// END
// Пример: select case 12 - все when сравниваются с этим
//             when 3*1 then 'Ok'
//             when 3*4 then 'pop'
//             else 'not'
//         end from dual; Вывод pop
//
// Пример: select name, IF(length(email) = length(last_name), 'Ok', 'not') - Если сравнивается один параметр
//         from users;
// Пример: другого синтаксиса
// select case
//    when 3*4 = 11 then 'true' - можно разные сравнения выводить в when
//    when 4*4 = 16 then 'false'
//    end
// from dual;
//
//
//
//
}
