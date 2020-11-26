
import java.util.concurrent.FutureTask;

public class demo2 {
    public static void main(String[] args) throws Exception{
        Xtex p=new Xtex();
        FutureTask<String> task1=new FutureTask<>(p);
        new Thread(task1,"线程S").start();
        new Thread(task1).start();
        System.out.println("task1"+task1.get());
    }
}
//参照这套方法，我应该可以将一个单线程问题提升；