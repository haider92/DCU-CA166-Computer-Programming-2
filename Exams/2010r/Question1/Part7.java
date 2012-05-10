import java.util.ArrayList;

class Part7 {
    static ArrayList<Integer> pickPos(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<numbers.size(); i++) {
            result.add(new Integer(Math.abs(numbers.get(i))));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(new Integer(-1));
        numbers.add(new Integer(2));
        numbers.add(new Integer(-3));
        numbers.add(new Integer(4));
        numbers.add(new Integer(-5));
        numbers.add(new Integer(6));
        numbers.add(new Integer(7));
        numbers = pickPos(numbers);
        for(int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}