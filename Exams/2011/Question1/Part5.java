class Distance {
	private int miles,yards;
	
	Distance() {
		//default constructor
	}
	
	Distance(int miles, int yards) {
		this.miles = miles; this.yards = yards;
	}
	
	void getDistance() {
		this.miles = Console.readInt();
		this.yards = Console.readInt();
	}
		
    public String toString()
	{
           String str = miles + " miles " + yards + " yards. "; 
           return str;
	}
}

class Part5 {
	public static void main(String[] args) {
		Distance d1 = new Distance(2,2);
		System.out.println(d1);
	}
}