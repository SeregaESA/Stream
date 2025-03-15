package generics;

import java.util.ArrayList;
import java.util.List;

public class Coments {

//    ? — обозначает любой тип.
//    ? extends T — обозначает любой тип, который является подтипом T (верхнее ограничение).
//    ? super T — обозначает любой тип, который является суперклассом T (нижнее ограничение).

//    В классах записать <?> нельзя. Только <T>. Но можем указать при объявлении поля private Box<? super Integer> box;
//    В классах можно использовать только верхний уровень - class Pop <T extends Number> {   }, так как для JVM
//    нет понятия Generic и после компиляции, если мы используем <T> JVM вместо Т подставляет класс Object (самый высокий класс).
//    При использовании <T extends Number> JVM подставит вместо Т самый высокий указанный класс Number (в данном случае
//    указывается, что класс может быть только числами)

//    В методах и полях можно указывать как нижнее, так и верхнее ограничение

//    Класс может быть записан <T extends Number & IF1 & IF2>, где IF1 и IF2 - это интерфейсы. В этой записи указанно,
//    что тип Т должен быть наследником от Number и имплиментить интерфейсы IF1 и IF2. Последовательность записи - класс
//    должен стоять на первом месте

//    Стирание типов (Type Erasure) - после компиляции происходит стирание Generic и JVM их уже не видит. Сделанно,
//    что бы совместить версии java до и после появления Generic. Например:
//    ArrayList<String> arrayList = new ArrayList<>() - так будет видеть компилятор
//    ArrayList arrayList = new ArrayList() - так будет видеть JVM.
//
//    public <T>  T rew (List<T> strings){
//        return strings.get(0);
//    } - переопределить этот метод не получится, так как вместо List<String> мы не сможем поставить List<Integer>,
//    так как после стирания типов они будут одинаковые

}
