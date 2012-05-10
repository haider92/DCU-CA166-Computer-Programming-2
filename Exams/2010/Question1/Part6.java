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

    long elapsed() {
        GregorianCalendar cal1 = new GregorianCalendar();
        GregorianCalendar cal2= new GregorianCalendar();
        cal2.set(year,month,day);
        return (((((((cal1.getTimeInMillis() - cal2.getTimeInMillis()))/1000)/60)/60)/24)/365);
    }

    public String toString() {
        return(day+"/"+month+"/"+year);
    }
}

class Part6 {
    public static void main(String[] args) {
        Date test = new Date(17,2,2011);
        System.out.println(test);
        System.out.println(test.elapsed() + " year");
    }
}