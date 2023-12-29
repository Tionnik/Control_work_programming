package Control_work_programming.Class;


import java.util.ArrayList;
import java.util.Calendar;

public class Horse extends Animal {
    private ArrayList<String> commands;

    public Horse(int id, String name, Calendar birthday, ArrayList<String> commands) {
        super(id, name, birthday);
        this.commands = commands;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "ID: "+ getId() +"  Имя животного: " + getName() +
                "  Дата рождения: " + getBirthday().get(Calendar.YEAR) + "-" + getBirthday().get(Calendar.MONTH) + "-" + getBirthday().get(Calendar.DAY_OF_MONTH) +
                "  Команды: " + getCommands() + "\n";
    }
}
