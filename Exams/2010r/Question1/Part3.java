class Part3 {
    public static void main(String[] args) {
        String value = Console.readToken();
        int count = 1;
        while(!Console.endOfFile()) {
            String s = Console.readToken();
            if(s.length()<value.length()) {
                value=s;
                count=1;
            } else if(s.length()==value.length()) {
                count++;
            }
        }
        System.out.print(count);
    }
}