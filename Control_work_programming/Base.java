package Control_work_programming;

import Control_work_programming.Class.Animal;
import Control_work_programming.Class.Cat;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Base {

    public ArrayList <Animal> getBase(){
        ArrayList <Animal> my_list = new ArrayList<>();
        ArrayList <String> command = new ArrayList<>();
        command.add("Sit");
        command.add("Pounce");
        command.add("Scratch");
        my_list.add(new Cat(1,"Barsik", new GregorianCalendar(2015,8, 9, 0, 0), command));

        return my_list;
    }
}
