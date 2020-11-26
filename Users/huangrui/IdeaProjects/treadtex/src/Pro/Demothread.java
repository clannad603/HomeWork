package Pro;

public class Demothread {
    public static void main(String[] args) {
       Texpro my=new Texpro();
       new Thread(my,"线程-01").start();
       my.run();
    }
}
