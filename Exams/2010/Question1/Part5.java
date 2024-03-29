import java.util.GregorianCalendar;
import java.util.Calendar;

class Date {
    private int day, month, year;

    Date(int d, int m, int y) {
        day=d;
        month=m;
        year=y;
    }

    Date newYear() {
        return(new Date(1,1,(year+1)));
    }

    public String toString() {
        return(day+"/"+month+"/"+year);
    }
}

class Part5 {
    public static void main(String[] args) {
        Date test = new Date(17,2,2011);
        System.out.println(test);
    }
}