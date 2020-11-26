package novtw;

import java.util.Scanner;

public class Caculate {
    public static void main(String[] args) {

        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int sum=0;
        int c=1;
        for (int i = 1; i <=n; i++) {
            c*=i;
            sum+=c;
        }
        System.out.println("the end "+sum);
    }
}

