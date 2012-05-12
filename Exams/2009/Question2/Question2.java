import java.util.*;

class Question2 {
    static boolean isLower(String word) {
        return word.equals(word.toLowerCase());
    }

    static boolean isUpper(String str) {
        return(str.equals(str.toUpperCase()));
    }

    public static void main(String[] args) {
        ArrayList<String> lower = new ArrayList<String>();
        ArrayList<String> upper = new ArrayList<String>();

        String sentence = Console.readString();
        String[] st = sentence.split(" ");
        //StringTokenizer st = new StringTokenizer("under Dust I lie Sans Wine sans Song sans Singer and SANS END");

        for(String word : st) {
            if(isLower(word)) {
                System.out.println(word);
                lower.add(word);
            }
            if(isUpper(word)) upper.add(word);
        }
        if(lower.size() > upper.size()) {
            System.out.println("lower case predominates");
            for(int i=0; i<lower.size(); i++) System.out.print(lower.get(i) + " ");
        } else {
            System.out.println("Upper case predominates");
            for(int i=0; i<upper.size(); i++) System.out.print(upper.get(i)+ " ");
        }
    }
}