package Control_work_programming.Class;


import java.util.Calendar;
                                        // Конструктор объектов класса животные
public class Animal {
    private int id;
    private String name;
    private Calendar Birthday;

    public Animal(int id, String name, Calendar birthday){
        this.id = id;
        this.name = name;
        this.Birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return Birthday;
    }
}