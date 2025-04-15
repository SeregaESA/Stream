package SQL.ddlCommands.ConstraintTypes;

public class ForeignKey {

// Foreign Key - использование только значения из опред. столбца табл. родителя или null.
// create table family(
// id integer primary key,
// имя varchar(20),
// возраст int default 1,
// family_hobby_id integer,
// foreign key (family_hobby_id)  references family_hobby(id)
// );
//
// create table family_hobby (
// id integer primary key ,
// хобби varchar(20)
// );
//
// Удаление из тоблицы, которая Foreign Key
// Прописать при определении ON DELETE CASCADE - удаляться строки к которым привязан Foreign Key
// create table family(
// id integer primary key,
// имя varchar(20),
// возраст int default 1,
// family_hobby_id integer,
// foreign key (family_hobby_id)  references family_hobby(id) on DELETE cascade
// );
//
// Прописать при определении ON DELETE SET NULL - заменит значения на null в строках к которым привязан Foreign Key
// create table family(
// id integer primary key,
// имя varchar(20),
// возраст int default 1,
// family_hobby_id integer,
// foreign key (family_hobby_id)  references family_hobby(id) on DELETE set null
// );
}
