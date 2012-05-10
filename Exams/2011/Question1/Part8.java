import java.util.LinkedList;

class Part8 {
	static LinkedList<String> getList() {
		LinkedList<String> words = new LinkedList<String>();
		while(!Console.endOfFile()) {
			String word = Console.readToken();
			if(word.length() >= 10) words.add(word);
		}
		return words;
	}
	
	public static void main(String[] args) {
		LinkedList<String> words = getList();
		for(int i=0;i<words.size();i++) System.out.println(words.get(i));
	}
}