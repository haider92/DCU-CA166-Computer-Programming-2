class Part1 {
    static boolean f1(int j, int k) {
        return k>j;
    }


    static int f2(int j, int k) {
        if(k>k) return k;
        else return j+1;
    }


    static String f3(int j, int k) {
        if(j==k) return "1";
        else return "2";
    }


    static void f4(int j, int k) {
        if(k>j) System.out.print(k-j);
        else System.out.print(j-k);
    }


    static void f5(int j, int k) {
        if (k!=j) System.out.print(k);
        else System.out.print("?");
    }


    /*static NotPossible f6(int j, int k) { //This is broken, as if k!=0 no return statement is ran.
    	if(k!=0) return j/k;
    } */
}