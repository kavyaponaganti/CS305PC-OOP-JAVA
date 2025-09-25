Class Lab3P45 {
    public static void main(String... args) {
        Lab3P4 IP = new Lab3P4();
        lp1.display();
        lp2.display(10);
        lp3.display(10, 20);
    }
    void display() {
        System.out.println("MOL without Parameters");
    }

    void display(int x) {
        System.out.println("MOL with parameters " + x);
    }

    void display(int x, int y) {
        System.out.println("MOL with 2 param x+y is " + (x + y));
    }
}