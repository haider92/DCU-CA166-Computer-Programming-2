class Point {
    private double x,y;

    Point(double x0, double y0) {
        x=x0;
        y=y0;
    }

    double distance() {
        return(Math.sqrt((x*x)+(y*y)));
    }

    boolean sameDistance(Point p) {
        return(this.distance() == p.distance());
    }
}

class Part5 {
    public static void main(String[] args) {
        Point p1 = new Point(5,5);
        Point p2 = new Point(5,5);
        System.out.println(p1.sameDistance(p2));
    }
}