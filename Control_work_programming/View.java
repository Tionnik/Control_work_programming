package Control_work_programming;

import Control_work_programming.Class.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class View {


    public void start() {
        Core core = new Core();

        Scanner scan = new Scanner(System.in);
        int com;
        String name;
        String birthday;
                                        // Консольное меню
        while (true) {
            System.out.println(   "\n[1] Добавить животного \n" +
                                    "[2] Показать всех животных\n" +
                                    "[3] Добавление команды к животному по его ID\n" +
                                    "[0] Выход\n" +
                                    "Выберите команду для работы: ");
            com = scan.nextInt();
            scan.nextLine();

            if (com == 1) {
                System.out.print("\n Введите имя животного, только латинские буквы: ");
                name = scan.nextLine();
                System.out.print("\n Введите Дату рождения животного в формате: 31.12.2020 : ");
                birthday = scan.nextLine();
                ArrayList<String> command = new ArrayList<>();
                System.out.println(       "\n[1] Добавление кота\n" +
                                            "[2] Добавление собаки\n" +
                                            "[3] Добавление хомяка\n" +
                                            "[4] Добавление лошади\n" +
                                            "[5] Добавление верблюда\n" +
                                            "[6] Добавление осла\n" +
                                            "Выберите команду для работы: ");
                com = scan.nextInt();
                scan.nextLine();
                if (com == 1) {
                    core.AddCat(name,birthday,command);
                    com = -1;
                }
                if (com == 2) {
                    core.AddDog(name,birthday,command);
                    com = -1;
                }
                if (com == 3) {
                    core.AddHamster(name,birthday,command);
                    com = -1;
                }
                if (com == 4) {
                    core.AddHorse(name,birthday,command);
                    com = -1;
                }
                if (com == 5) {
                    core.AddCamel(name,birthday,command);
                    com = -1;
                }
                if (com == 6) {
                    core.AddDonkey(name,birthday,command);
                    com = -1;
                }
            }

            if (com == 2) {
                core.ShowAnimal();
            }
            if (com == 3) {
                ArrayList<String> commands = new ArrayList<>();
                System.out.println("Введите ID животного для добавления команд: ");
                int id = scan.nextInt();
                scan.nextLine();
                Animal animal = core.SearchId(id);
                if (animal != null){
                    System.out.print(animal);
                    System.out.println("Введите команду ");
                        commands.add(scan.nextLine());
                        core.AddCommand(id,commands);
                }
                else {System.out.print("Нет такого животного");}
            }
            if (com == 0) {
                break;
            }
        }
    }
}