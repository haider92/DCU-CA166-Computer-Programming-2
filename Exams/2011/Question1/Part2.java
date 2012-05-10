class Part2 {
	static String doubleIt(String numAsString) {
		return Integer.toString((Integer.parseInt(numAsString)*2));
	}
	
	public static void main(String[] args) {
		System.out.println(doubleIt("2"));
	}
}