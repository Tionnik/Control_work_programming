package Control_work_programming.Class;

import java.util.Calendar;

public class Animal {
                                            // Конструктор объектов класса животные
    private String name;
    private Calendar Birthday;

    public Animal(String name, Calendar birthday){
        this.name = name;
        this.Birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return Birthday;
    }
}