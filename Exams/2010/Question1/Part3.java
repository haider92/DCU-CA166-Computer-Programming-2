class Part3 {
    static int max(int[][] b, int m, int n) {
        int total = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(b[i][j] > 0) total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] [] b = {    {   3,   -4,   -1,   -3,   5,   4   },
            {   4,   -8,    3,  10,  -31,  12   },
            {  13,  -11,   12,  16,   12,  11   },
        };

        int y=max(b, 2, 5);

        System.out.println("The number of positive integers in the first 2 rows and 3 columns is "+y);
    }
}