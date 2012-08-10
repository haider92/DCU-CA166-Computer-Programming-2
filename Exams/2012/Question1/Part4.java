class Part4 {
	public static void main(String[] args) {
		String[] names = {"Sligo", "Dublin", "Llanfairpwllgwyngyll", "Paris", "London"};
		int i=0;
		while(i != names.length) {
			if(names[i].length() > 12) { 
				System.out.println(names[i]); 
				break;
			}
			i++;
		}
		if(i==names.length) System.out.println("no such string");
	}
}