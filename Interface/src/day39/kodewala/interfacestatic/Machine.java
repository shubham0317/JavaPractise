package day39.kodewala.interfacestatic;


interface Printable {
    void scan();
}

interface Scannable {
    void scan();
}

public class Machine implements Printable, Scannable {
    @Override
    public void scan() {
        System.out.println("Machine is scanning/printing");
    }
}

