class Point {
    private double x, y;

    //Constructors not required.
    Point() {
        //default constructor
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //end of constructors

    /* void get() {
    	x = Console.readInt();
    	y = Console.readInt();
    } */

    void put() {
        System.out.print("(" + x + "," + y + ")");
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
}

class Line {
    private Point start = new Point(),finish = new Point();

    //Constructors not required
    Line() {
        //default constructor
    }

    Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }
    //end of constructors

    /*void get() {
    	start.get();
    	finish.get();
    } */

    double slope() {
        return(((finish.getY() - start.getY()) / (finish.getX() - start.getX())));
    }

    boolean isParallel(Line l2) {
        return(l2.slope()==this.slope());
    }
}

class Question3 {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1,1),new Point(5,3));
        Line l2 = new Line(new Point(2.25,5.5),new Point(6.25,7.5));
        if(l1.isParallel(l2)) System.out.println("They are parallel");
        else System.out.println("They are not parallel");
    }
}