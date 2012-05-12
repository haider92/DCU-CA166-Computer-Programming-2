class Part3 {
    public static void main(String[] args) {
        int amount = Integer.parseInt(args[1]);
        for(int i=0; i<amount; i++) {
            System.out.print(args[0]);
        }
        System.out.println();
    }
}