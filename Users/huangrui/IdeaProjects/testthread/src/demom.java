public class demom {
    public static void main(String[] args) {
        Mythread my=new Mythread();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
    }
}
