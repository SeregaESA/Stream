package Hibernate.HQL;

public class CriteriaAPI {

// Criteria API - служит для динамических (условие where меняется динамически) запросов SQL
//
// Пример:
// CriteriaBuilder cb = session.getCriteriaBuilder(); - получаем объект CriteriaBuilder через который далее будет
//                                                      писаться SQL запрос
// CriteriaQuery criteria = cb.creatQuery(User.class) - указыв
// User user = criteria.from(User.class);
//
// criteria.select(user);
// session.creatQuery(criteria).list(); - пример
//
// Пример с where:
// criteria.select(user).where(
//         cb.egual(user.get("имя табл").get("name - колонка табл"), name);
// cb. - содержит в себе функции SQL (and, or, count и т.д)
//

}
