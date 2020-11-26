public class Mythread  implements Runnable{
    private  int num=5;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(num>0){
            System.out.println("恰了"+num--);}
        }
    }
}
//利用多线程提高效率；