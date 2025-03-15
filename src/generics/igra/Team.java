package generics.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// <T extends Igroki> так мы указываем, что тип Т может быть только класом Igroki и вниз по иеархии
public class Team <T extends Igroki> {
    private String name;
    private List<T> igrokis = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewIgroki (T igroki) {
        igrokis.add(igroki);
        System.out.println("В команду " + name +
                " был добавлен игрок по имени " + igroki.getName());
    }

//  Team<T> team мы указываем, что метод может вызваться только с типом Т класса
    public void playWhith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Выйграла команда " + winnerName);
    }

}
