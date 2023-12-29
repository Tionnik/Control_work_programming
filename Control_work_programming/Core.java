package Control_work_programming;

import Control_work_programming.Class.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Core {

    ArrayList<Animal> catalog = new Base().getBase();
                                        // Показывает всех животных в базе
    public void ShowAnimal() {
        for (Animal item : catalog) {
            System.out.println(item);
        }
    }
                                        // Метод поиска животных по id
    public Animal SearchId(int id){
        for (Animal item : catalog) {
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }
                                        // Методы добавления  новых исполнительных команд животными
    public void AddCommand(int id, ArrayList <String> new_commands){
        if ( new_commands.isEmpty())  {
            Animal animal = SearchId(id);
            if (animal instanceof Cat) {
                ArrayList<String> old_commands = ((Cat) animal).getCommands();
                for (String command : new_commands) {
                    old_commands.add(command);
                }
            }
            if (animal instanceof Dog) {
                ArrayList<String> old_commands = ((Dog) animal).getCommands();
                for (String command : new_commands) {
                    old_commands.add(command);
                }
            }
            if (animal instanceof Donkey) {
                ArrayList<String> old_commands = ((Donkey) animal).getCommands();
                for (String command : new_commands) {
                    old_commands.add(command);
                }
            }
            if (animal instanceof Camel) {
                ArrayList<String> old_commands = ((Camel) animal).getCommands();
                for (String command : new_commands) {
                    old_commands.add(command);
                }
            }
            if (animal instanceof Horse) {
                ArrayList<String> old_commands = ((Horse) animal).getCommands();
                for (String command : new_commands) {
                    old_commands.add(command);
                }
            }
            if (animal instanceof Hamster) {
                ArrayList<String> old_commands = ((Hamster) animal).getCommands();
                for (String command : new_commands) {
                    old_commands.add(command);
                }
            }
        }
        else {System.out.print("Нет команд для добавления");}

    }
                                        //Методы добавления  разных животных
    public void AddCat(String name, String birthday, ArrayList<String> commands){
        int id = catalog.getLast().getId();
        int currentId = new AddId().Add(id,name,birthday);  // Проверка на валидность полученных данных и по id для нового животного
        if (currentId > 0) {
            String[] textDate = birthday.split("\\.");
            catalog.add(new Cat(currentId, name, new GregorianCalendar (Integer.parseInt(textDate[2]),Integer.parseInt(textDate[1]),Integer.parseInt(textDate[0])), commands));
        }
        else System.out.println("Данные животного заполнены не корректно");
    }
    public void AddDog(String name, String birthday, ArrayList<String> commands){
        int id = catalog.getLast().getId();
        int currentId = new AddId().Add(id,name,birthday);
        if (currentId > 0) {
            String[] textDate = birthday.split("\\.");
            catalog.add(new Dog(currentId, name, new GregorianCalendar (Integer.parseInt(textDate[2]),Integer.parseInt(textDate[1]),Integer.parseInt(textDate[0])), commands));
        }
        else System.out.println("Данные животного заполнены не корректно");
    }
    public void AddHamster(String name, String birthday, ArrayList<String> commands){
        int id = catalog.getLast().getId();
        int currentId = new AddId().Add(id,name,birthday);
        if (currentId > 0) {
            String[] textDate = birthday.split("\\.");
            catalog.add(new Hamster(currentId, name, new GregorianCalendar (Integer.parseInt(textDate[2]),Integer.parseInt(textDate[1]),Integer.parseInt(textDate[0])), commands));
        }
        else System.out.println("Данные животного заполнены не корректно");
    }
    public void AddHorse(String name, String birthday, ArrayList<String> commands){
        int id = catalog.getLast().getId();
        int currentId = new AddId().Add(id,name,birthday);
        if (currentId > 0) {
            String[] textDate = birthday.split("\\.");
            catalog.add(new Horse(currentId, name, new GregorianCalendar (Integer.parseInt(textDate[2]),Integer.parseInt(textDate[1]),Integer.parseInt(textDate[0])), commands));
        }
        else System.out.println("Данные животного заполнены не корректно");
    }
    public void AddCamel(String name, String birthday, ArrayList<String> commands){
        int id = catalog.getLast().getId();
        int currentId = new AddId().Add(id,name,birthday);
        if (currentId > 0) {
            String[] textDate = birthday.split("\\.");
            catalog.add(new Camel(currentId, name, new GregorianCalendar (Integer.parseInt(textDate[2]),Integer.parseInt(textDate[1]),Integer.parseInt(textDate[0])), commands));
        }
        else System.out.println("Данные животного заполнены не корректно");
    }
    public void AddDonkey(String name, String birthday, ArrayList<String> commands){
        int id = catalog.getLast().getId();
        int currentId = new AddId().Add(id,name,birthday);
        if (currentId > 0) {
            String[] textDate = birthday.split("\\.");
            catalog.add(new Donkey(currentId, name, new GregorianCalendar (Integer.parseInt(textDate[2]),Integer.parseInt(textDate[1]),Integer.parseInt(textDate[0])), commands));
        }
        else System.out.println("Данные животного заполнены не корректно");
    }
}
