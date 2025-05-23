package Hibernate;

public class OneToMany {

// Используется коллекция в классе к которому будет относиться множество. Если оссоциация заканчивается на Many, то
// должна быть коллекция
//
// @OneToMany - One относится к тому классу в котором будет List
// @JoinColumn(name = "company_id" - в табл. Users)
// @JoinColumn(mappedBy = "company") - такая запись используется, если в зависимой табл уже есть связь ManyToOne и идёт
//                                     ссылка на этот класс. И указывается соответствующее поле mappedBy = "company"
// private List<User> users
//
// fetch = FetchType.LAZY - стоит по умолчанию в OneToMany, так и нужно, что бы не загружать сразу всю коллекцию, только
//                          когла она понадобится, так как может быть очень большая
// cascade = CascadeType.All - лучше использовать. Указывает, что при сохранении/удалении новой компании,
//                             сохраняться/удалятся и пользователи, которые были добавлены во время сессии.
// orphanRemoval = true - даст удалить пользователя из коллекции и БД без каскадной зависимости
//
//
//
//
//
}
