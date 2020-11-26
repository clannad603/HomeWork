import java.util.concurrent.Callable;

public class Xtex implements Callable <String>{
private int ticket=9;
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            if (this.ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖票，ticket"+this.ticket--);
            }
        }
        return "piaowanl";
    }
}
