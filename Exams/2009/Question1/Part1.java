class Part1 {
    static boolean f1(int x, int y) {
        return (x>y);
    }

    static void f2() {
        System.out.print("true");
    }

    static String f3() {
        return "true";
    }

    /*
    static none f4(int x, int y) {
    	if(y!=0) return x/y;
    	else System.out.print("error");
    }
    */

    /*
    static none f5() {
    	if(y!=0) return x/y;
    }
    */

    static int f6(double x) {
        return Math.round(x);
    }
}