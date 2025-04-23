package Hibernate.HQL;

public class HQL {

// задаём через session.createQuery(передаём HQL запрос строкой, User.class - указываем какой тип ожидаем)
//
// HQL запросах мы уже оперируем сущностями, а не таблицами
// SQL - select * from user; user - таблица
// HQL - select u from User u; User - класс
//
// Результат createQuery - это объект типа Query
//
// Пример: session.createQuery("select u from User u where u.name = 'Sergei'", User.class).geResultList;
//         geResultList - указываем как хотим видеть результат
//
// Пример: session.createQuery("select u from User u where u.name = :HQLName", User.class)
//         .setParameter("HQLName", "Sergei").list
//         :HQLName - указываем именованный параметр, что параметр будет установлен из вне, что бы не привязывать
//         к одному параметру
//         setParameter("HQLName", "Sergei") - устанавливаем на индекс HQLName параметр
//
// Можно использовать обычный SQL запрос. И всё равно Hibernate смапит его в нашу сущность
// Пример: session.creatNativeQuery("select u.* from users u where u.name = 'Sergei'", User.class)
//
//
//
}
