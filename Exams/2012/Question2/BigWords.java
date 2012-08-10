import java.util.*;
import java.io.*;

class BigWords {
	public static void main(String[] args) {
		if(args.length > 0) {
			try {
				Scanner f = new Scanner(new File(args[0]));
				ArrayList<String> words = new ArrayList<String>();
				int totallength=0;
				while(f.hasNext()) {
					String word = f.next();
					totallength += word.length();
					words.add(word);
				}
				f.close();
				int average = totallength/words.size();
				for(String word : words) {
					if(word.length() > average) System.out.println(word);
				}				
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Syntax Error!");
			System.out.println("java BigWords <filename>");
		}
	}
}