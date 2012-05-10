class Time {
    private int time;
    Time() {
        //default constructor
    }

    void get() {
        this.time = Console.readInt();
    }

    boolean gt(Time otherTime) {
        if(time > otherTime.time) return true;
        else return false;
    }
}

class Period {
    private Time start, stop;
    Period() {
        //default constructor
    }

    void get() {
        start = new Time();
        stop = new Time();
        start.get();
        stop.get();
    }

    boolean overlaps(Period otherPeriod) {
        return((stop.gt(otherPeriod.start)) && (otherPeriod.stop.gt(start)));
    }
}

class Question3 {
    public static void main(String [] args) {
        System.out.println("Enter two periods:");
        Period first = new Period();
        first.get();
        Period second = new Period();
        second.get();
        if(first.overlaps(second)) System.out.println("They overlap");
        else System.out.println("They do not overlap");
    }
}