class Pair {
    private int x;
    private int y;

    Pair(int xO, int y0) {
        x = xO;
        y = y0;
    }

    void change () {
        x++;
    }

    void put() {
        System.out.println(x + " " + y);
    }

}


class Part4 {
    public static void main(String[] args) {
        Pair p = new Pair(1,4);
        Pair q = new Pair(6,9);
        p=q;
        p.change();
        q.put();
    }
}
