package Control_work_programming;

import Control_work_programming.Class.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Base {
                                                // База с предварительно заполненными животными (также тут можно реализовать обращение к базе данных)
    public ArrayList <Animal> getBase(){
        ArrayList <Animal> my_list = new ArrayList<>();
        ArrayList <String> command = new ArrayList<>();
        command.add("Sit");
        command.add("Pounce");
        command.add("Scratch");
        my_list.add(new Cat(1,"Barsik", new GregorianCalendar(2015,8, 9, 0, 0), command));

        command = new ArrayList<>();
        command.add("Sit");
        command.add("paw");
        command.add("next_to");
        command.add("voice");
        my_list.add(new Dog(2,"Dick", new GregorianCalendar(2021,9, 1, 0, 0), command));

        command = new ArrayList<>();
        command.add("roll_over");
        command.add("ugh");
        command.add("jump");
        command.add("sit");
        my_list.add(new Hamster(3,"Turbo", new GregorianCalendar(2022,5, 10, 0, 0), command));

        command = new ArrayList<>();
        command.add("walk");
        command.add("run");
        command.add("jump");
        command.add("stand");
        my_list.add(new Horse(4,"Bucephalus", new GregorianCalendar(2018,3, 20, 0, 0), command));

        command = new ArrayList<>();
        command.add("walk");
        command.add("lie_down");
        command.add("stand_up ");
        command.add("stand");
        my_list.add(new Camel(5,"Omelette", new GregorianCalendar(2018,4, 20, 0, 0), command));

        command = new ArrayList<>();
        command.add("walk");
        command.add("stand");
        my_list.add(new Camel(6,"Shpuntik", new GregorianCalendar(2020,5, 4, 0, 0), command));

        return my_list;
    }
}
