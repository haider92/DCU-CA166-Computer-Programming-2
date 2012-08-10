import java.util.Scanner;

class Weight {
	private int lb,oz;
	
	Weight() {
		//no-args-constructor
	}
	
	Weight(int ounces) {
		oz = ounces;
	}
	
	void getWeight() {
		Scanner sc = new Scanner(System.in);
		lb = sc.nextInt();
		oz = sc.nextInt();
	}
	
	void putWeight() {
		System.out.println(lb + " lb " + oz + " oz");
	}
	
	private int toOz() {
		return((16*lb)+oz);
	}
	
	boolean lte(Weight w2) {
		return (this.toOz()<=w2.toOz());
	}
}