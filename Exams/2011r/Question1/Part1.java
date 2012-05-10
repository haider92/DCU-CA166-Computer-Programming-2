class Part1 {
    static String met1(String s) {
        if(s==null) return "";
        else return s;
    }

    static boolean met2(String s) {
        return s=="";
    }

    static String met3(double x) {
        return ""+x;
    }

    static String met4(double x) {
        if(x>=0) return "1";
        else return "0";
    }

    static void met5(double x) {
        if(x>=0) System.out.print(Math.sqrt(x));
        else System.out.print(Math.sqrt(-x));
    }

    /*
    Errors due to being no return when x is < 0.001
    static double met6(double x) {
    	if(x>0.001) return 1/x;
    } */
}