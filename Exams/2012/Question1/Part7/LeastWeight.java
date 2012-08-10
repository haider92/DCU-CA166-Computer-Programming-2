class LeastWeight {
	public static void main(String[] args) {
		Weight w1 = new Weight();
		Weight w2 = new Weight();
		Weight w3 = new Weight();
		w1.getWeight(); w2.getWeight(); w3.getWeight();
		if(w1.lte(w2) && w1.lte(w3)) w1.putWeight();
		else if(w2.lte(w1) && w2.lte(w3)) w2.putWeight();
		else w3.putWeight();
	}
}