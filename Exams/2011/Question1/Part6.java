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
	
	public Distance add(Distance secondDistance) {
		Distance result = new Distance();
		result.miles = miles + secondDistance.miles;
		result.yards = yards + secondDistance.yards;
		if(result.yards >= 1760) {
			result.miles = result.miles+(result.yards/1760);
			result.yards = result.yards%1760;
		}
		return result;
	}
	
    public String toString()
	{
           String str = miles + " miles " + yards + " yards. "; 
           return str;
	}
}


class Part6 {
	public static void main(String[] args) {
		Distance d1 = new Distance(1,1);
		System.out.println(d1.add(d1));
	}
}