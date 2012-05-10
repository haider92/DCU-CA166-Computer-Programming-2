class Duration {
    private int hours, mins;

    Duration() {
        //default constructor
    }

    Duration(int hours, int mins) {
        this.hours = hours;
        this.mins = mins;
    }

    void get() {
        hours = Console.readInt();
        mins = Console.readInt();
    }

    void put() {
        System.out.println(hours + " hours " + mins + " minutes");
    }
}

class Part5 {
    public static void main(String[] args) {
        Duration sample = new Duration(12,2);
        sample.put();
    }
}