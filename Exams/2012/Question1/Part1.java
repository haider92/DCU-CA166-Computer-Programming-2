class Part1 {
	static int method1(int x) {
		if(x>0) return 1; else return -1;
	}
	
	static boolean method2(double x, double y) {
		if(x>y) return true;
		else return false;
	}
	
	static void method3(int x, int y) {
		if(x>y) System.out.print("first");
		else System.out.print("second");
	}
	
	static int method4(double x) {
		return Math.abs(x);
	}
	
	/* static ... method5(int x, int y) {
		if(y!=0) return x/y;
		else System.out.println("attempted zero divide");
	} */
	
	static boolean method6(String s, String t) {
		return s.length()==t.length();
	}
}