package Control_work_programming;

public class AddId {

    public int Add(int num, String name, String birthday){

        try {
            if(name.matches("[a-zA-Z]+")) {
                String[] textDate = birthday.split("\\.");
                if ((textDate.length == 3) &&
                        (TimeCheck.checkDate(Integer.parseInt(textDate[2]), Integer.parseInt(textDate[1]), Integer.parseInt(textDate[0]))) &&
                        (TimeCheck.futureDate(Integer.parseInt(textDate[2]), Integer.parseInt(textDate[1]), Integer.parseInt(textDate[0])))) {
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
