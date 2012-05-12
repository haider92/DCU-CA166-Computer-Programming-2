class Part2 {
    public static void main(String[] args) {
        String s = "catFood";
        boolean b = "cat".equals(s.substring(0,3));
        int j = s.indexOf("cat");
        int k = indexOfOrLength(s,"cat");
        String t = s.substring(0,5).toUpperCase() + s.substring(5);
    }
    static int indexOfOrLength(String s1, String s2) {
        if(s1.indexOf(s2) != -1) return s1.indexOf(s2);
        else return s1.length();
    }
}