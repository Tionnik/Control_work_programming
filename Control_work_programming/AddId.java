package Control_work_programming;

public class AddId {
                                                        // Метод проверки на валидность данных для создания экземпляра
    public int Add(int num, String name, String birthday){

        try {
            if(name.matches("[a-zA-Z]+")) {     // Проверка имя на латинские буквы
                String[] textDate = birthday.split("\\.");
                if ((textDate.length == 3) &&           // Правильность заполнении поля дата
                        (TimeCheck.checkDate(Integer.parseInt(textDate[2]), Integer.parseInt(textDate[1]), Integer.parseInt(textDate[0]))) &&   // на существование такой даты
                        (TimeCheck.futureDate(Integer.parseInt(textDate[2]), Integer.parseInt(textDate[1]), Integer.parseInt(textDate[0])))) {  // на то что дата прошедшая
                    num++;
                    return num;
                } else {
                    num = -1;
                    return num;
                }
            }
            else {
                num = -1;
                return num;
            }

        } catch (Exception e) {
            num = -1;
            return num;
        }
    }
}
