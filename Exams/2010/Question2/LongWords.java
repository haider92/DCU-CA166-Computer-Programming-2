import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class LongWords {
    public static void main(String[] args) {
        if(args.length > 0) {
            try {
                ArrayList<String> words = new ArrayList<String>();
                Scanner SourceIn = new Scanner(new File(args[0]));
                int totalLength=0, amountOfWords=0;
                while(SourceIn.hasNext()) {
                    String word = SourceIn.next();
                    words.add(word);
                    totalLength=totalLength+word.length();
                    amountOfWords++;
                }
                int average = totalLength/amountOfWords;
                for(int i=0; i<words.size(); i++) {
                    String word = words.get(i);
                    if(word.length() > average) System.out.println(word);
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Syntax error:\njava longWords source.txt");
        }
    }
}