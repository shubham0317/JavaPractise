class TypeCasting {

    public static void main(String[] args) {

        // Implicit casting
        int a = 100;
        double b = a;

        System.out.println("Implicit casting: " + b);

        // Explicit casting
        double x = 100.99;
        int y = (int) x;

        System.out.println("Explicit casting: " + y);
    }

}