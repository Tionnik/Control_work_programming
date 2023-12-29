package Control_work_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class View {


    public void start() {
        Core core = new Core();

        Scanner scan = new Scanner(System.in);
        int com;
        String name;
        String birthday;

        while (true) {
            System.out.println(   "\n[1] Добавить животного \n" +
                                    "[2] Показать всех животных\n" +
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

                core.AddCat(name,birthday,command);
            }

            if (com == 2) {
                core.ShowAnimal();
            }
            if (com == 0) {
                break;
            }
        }
    }
}