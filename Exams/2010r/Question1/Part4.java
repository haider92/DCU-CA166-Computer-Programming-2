class Part4 {
    static boolean parityCheck(int[] j, int[] k) {
        boolean result=true;
        for(int i=0; i<j.length; i++) {
            if(Math.abs(j[i]%2) != Math.abs(k[i]%2)) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {8,  -1, 0,  2, 1, 3, 1};
        int[] b = {2, -9, 3, -7, 3, 6, 1};
        System.out.println(parityCheck(a,b));
    }
}