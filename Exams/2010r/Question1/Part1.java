class Part1 {
    static int f1(int j, int k) {
        if(j>k) return j;
        else return k;
    }

    static boolean f2(int j, int k) {
        return (j>k);
    }

    static void f3(int j, int k) {
        System.out.print("j is bigger: " + (j>k));
    }

    static String f4(int j, int k) {
        if(j==k) return "equal";
        else return "unequal";
    }

    /* Not possible causes an error.
    static String f5(int j, int k) {
    	if(j==k) return "equal";
    } */

    static void f6(int j, int k) {
        if(j==k) System.out.print("equal");
        else System.out.print("unequal");
    }
}