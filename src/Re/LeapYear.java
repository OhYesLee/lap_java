package Re;

public class LeapYear {
    public static boolean IsLeapYear(int year) {
        if (year % 4 == 0) {
            boolean result = true;
            if (year % 100 == 0) {
                result = false;
                if (year % 1000 == 0) {
                    result = true;
                }
            }
        }
        return true;
    }

}
