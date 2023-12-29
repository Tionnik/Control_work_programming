package Control_work_programming.Class;

import java.util.ArrayList;
import java.util.GregorianCalendar;
                                        // Конструктор объектов класса ослов
public class Donkey extends Animal {
    private ArrayList<String> commands;

    public Donkey(int id, String name, GregorianCalendar birthday, ArrayList<String> commands) {
        super(id, name, birthday);
        this.commands = commands;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    @Override
    public String toString() {
        return "ID: "+ getId() +"  Имя осла: " + getName() +
                "  Дата рождения: " + getBirthday().get(GregorianCalendar.YEAR) + "-" + getBirthday().get(GregorianCalendar.MONTH) + "-" + getBirthday().get(GregorianCalendar.DAY_OF_MONTH) +
                "  Команды: " + getCommands() + "\n";
    }
}