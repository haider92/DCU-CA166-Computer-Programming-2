class Part1 {
    static int f1(int x) {
        return (x*x);
    }

    static void f1(int x) {
        System.out.print(x*x);
    }

    static double f3(int x) {
        return Math.random()*x;
    }

    static boolean f4(int x, int y) {
        return x==y;
    }

    static void f5(int x, int y) {
        if(y==0) System.out.print("zero divisor");
        else System.out.print(x/y);
    }

    /*static NotPossible f6(int x, int y) { //it is returning both a string and double, not possible
    	if(y==0) return ("zero divisor");
    	else return (x/y);
    }*/
}