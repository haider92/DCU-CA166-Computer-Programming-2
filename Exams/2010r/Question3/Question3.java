class Date {
    private int day, month, year;

    //Constructors
    Date() {
        //default constructor
    }

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void get() {
        day = Console.readInt();
        month = Console.readInt();
        year = Console.readInt();
    }

    void put() {
        System.out.print(day+"/"+month+"/"+year);
    }

    boolean postDates(Date d) {
        return(year > d.year || year >= d.year && month > d.month || year >= d.year && month >= d.month && day > d.day);
    }

    /*private int elapsedDays() {

    }*/
}

class Question3 {
    public static void main(String[] args) {
        Date max = new Date();
        max.get();
        while(!Console.endOfFile()) {
            Date tmp = new Date();
            tmp.get();
            if(tmp.postDates(max)) max=tmp;
        }
        max.put();
    }
}