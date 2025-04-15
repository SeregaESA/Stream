package SQL.dmlCommands.selectPack.transactions;

public class Savepoint {

// Добавляет функциональности к rollback. Rollback произойдет до указанного savepoint. Savepoint не заканчивает
// транзакцию, а указывает до какого состояния может откатится rollback
// Savepoint savepoint_name;
// Пример: start transaction;
//         insert into new_cars (id, model, series) value (2, 'pop', 37);
//         savepoint s1;
//         update new_cars set model = 'honda' where series = 35;
//         savepoint s2;
//         delete from new_cars where series = 37;
//         rollback to savepoint s1; - не заканчивает транзакцию
//         commit(rollback); - закрыта транзакцию
//
}
