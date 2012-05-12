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

    Point midPoint(Point p2) {
        Point midpoint = new Point();
        midpoint.x = (x+p2.x)/2;
        midpoint.y = (y+p2.y)/2;
        return midpoint;
    }
}

class Part6 {
    public static void main(String[] args) {
        System.out.println("Enter two points");
        Point first = new Point();
        Point second = new Point();
        first.get();
        second.get();
        System.out.println("The midpoint is " + first.midPoint(second));
    }
}