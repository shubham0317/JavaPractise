class FinalQuestion {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        int c = a++ + ++b; // 16 --> a increases and  becomes 6 but used as 5 bcs its post increment and b is increased and used so it is 11;

        if (c > 15 && ++a > 6) {  // first condtion is true a is 6 already 6 and its increasing by preincrement means increased value will be used; 
            System.out.println("A");  // so the a is 7 and second condition is also true; print is a
        } else {
            System.out.println("B");
        }

        System.out.println(a);  //7
        System.out.println(b);  //11
        System.out.println(c); // 16
    }
}