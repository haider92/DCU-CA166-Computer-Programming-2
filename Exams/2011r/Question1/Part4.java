class Part4 {
    static void make(String[] st) {
        for(String i : st) {
            for(int j=i.length()-1; j>=0; j--) {
                System.out.print(i.charAt(j));
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        String[] st = {"cat","dog","horse"};
        make(st);
    }
}