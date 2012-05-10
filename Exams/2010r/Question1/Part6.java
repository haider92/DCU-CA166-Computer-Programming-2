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

    Point reflection() {
        return(new Point(x,-y));
    }
}

class Part6 {
    public static void main(String[] args) {
        Point[] pointList = new Point[4];
        pointList[0] = new Point(1.0,1.0);
        pointList[1] = new Point(1.0,-1.0);
        pointList[2] = new Point(-1.0,1.0);
        pointList[3] = new Point(-1.0,-1.0);
    }
}