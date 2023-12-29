package Control_work_programming.Class;

import java.util.ArrayList;
import java.util.Calendar;

public class Dog extends Animal {
    private int id;
    private ArrayList<String> commands;

    public Dog(int id, String name, Calendar birthday, ArrayList<String> commands) {
        super(name, birthday);
        this.commands = commands;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "  Имя животного: " + getName() + "  Дата рождения: " + getBirthday() +
                "  Команды: " + getCommands() + "\n";
    }
}