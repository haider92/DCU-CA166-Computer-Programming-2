class Point {
    private double x,y;

    Point() {
        //default constructor;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void get() {
        x = Console.readDouble();
        y = Console.readDouble();
    }

    public String toString() {
        return("("+x+","+y+")");
    }
}

class Part5 {
    public static void main(String[] args) {
        System.out.println("Enter a point");
        Point first = new Point();
        System.out.println(first);
    }
}