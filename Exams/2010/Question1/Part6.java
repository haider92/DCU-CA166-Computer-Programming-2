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

    long elapsed(Date d2) {
        GregorianCalendar compareWith = new GregorianCalendar(year,month,day);
        GregorianCalendar dateSupplied = new GregorianCalendar(d2.year,d2.month,d2.day);
        return(((((((dateSupplied.getTimeInMillis() - compareWith.getTimeInMillis())/1000)/60)/60)/24)/365));
    }
	
    long elapsed() {
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar compareWith = new GregorianCalendar(year,month,day);
        return(((((((today.getTimeInMillis() - compareWith.getTimeInMillis())/1000)/60)/60)/24)/365));
    }

    public String toString() {
        return(day+"/"+month+"/"+year);
    }
}

class Part6 {
    public static void main(String[] args) {
        Date d1 = new Date(17,2,2011);
    	Date d2 = new Date(17,2,2013);
       	System.out.println(d1.elapsed(d2));
        System.out.println(d1.elapsed());
    }
}