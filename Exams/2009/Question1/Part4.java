class Part4 {
    static int firstNeg(int[] b) {
        for(int i=0; i<b.length; i++) {
            if(b[i] < 0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] b = {9,-8,3};
        System.out.println(firstNeg(b));
    }
}