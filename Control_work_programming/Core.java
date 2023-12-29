package Control_work_programming;

import Control_work_programming.Class.Animal;
import Control_work_programming.Class.Cat;

import java.util.ArrayList;
import java.util.Calendar;

public class Core {

    ArrayList<Animal> catalog = new Base().getBase();

    public void ShowAnimal() {
        for (Animal item : catalog) {
            System.out.println(item);
        }
    }
    public void AddCat(String name, Calendar birthday, ArrayList<String> commands){
        int id = catalog.getLast().getId();
        int currentId = new AddId().Add(id,name,birthday);
        if (currentId > 0) {
            catalog.add(new Cat(currentId, name, birthday, commands));
        }
        else System.out.println("Данные животного заполнены не корректно");
    }
}
