import java.util.ArrayList;

class Part8 {
    static ArrayList<String> reduceList(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<String>();
        for(int i=0; i<words.size(); i++) {
            String word = words.get(i);
            if(word.length() > 4) result.add(word);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("chestnut");
        words.add("pine");
        words.add("alder");
        words.add("rowan");
        words.add("ash");
        words.add("beech");
        ArrayList<String> output = reduceList(words);
        for(int i=0; i<output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}