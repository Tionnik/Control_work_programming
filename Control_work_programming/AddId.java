package Control_work_programming;

import java.util.Calendar;

public class AddId {

    public int Add(int num, String name, Calendar birthday){
        Calendar today = Calendar.getInstance();
        try {
            if(name != null && !name.trim().isEmpty()) {
                if ((birthday.get(Calendar.YEAR)) <= (today.get(Calendar.YEAR))) {
                    if ((birthday.get(Calendar.MONTH)) <= (today.get(Calendar.MONTH))) {
                        if ((birthday.get(Calendar.DAY_OF_MONTH)) <= (today.get(Calendar.DAY_OF_MONTH))) {
                            return num + 1;
                        }
                    }
                }
            }
            else return num = -1;
        } catch (Exception e) {
            return num = -1;
        }
        return num;
    }
}
