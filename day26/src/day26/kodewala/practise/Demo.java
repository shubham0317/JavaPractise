package day26.kodewala.practise;

class Counter {
    static int count = 5;
    int value = count++;

    Counter() {
        count += 2;
        value += count;
    }
}

public class Demo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(c1.value);
        System.out.println(c2.value);
        System.out.println(Counter.count);
    }
} 
