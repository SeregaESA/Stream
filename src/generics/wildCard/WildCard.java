package generics.wildCard;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {

//     List<Number> list = new ArrayList<Integer>(); - так писать нельзя. Левая и правая часть должны быть одинаковые

        List<?> list = new ArrayList<String>(); // <?> указывает, что можно подставить любой тип и мы не можем вызывать
//      методы, которые изменяют наш объект

        List<? extends Number> list2 = new ArrayList<Integer>(); // Таким ограничением мы указываем, что наш лист
//      может быть только наследником или самим Number

        List<? super Number> list3 = new ArrayList<Object>(); // Таким ограничением мы указываем, что наш лист
//      может быть только потомком или самим Number

    }

    static void showListInfo(List<?> list) { // <?> указывает, что в метод можно передать любой тип List
        System.out.println(list);
    }
}
