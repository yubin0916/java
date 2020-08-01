package git;

import java.util.Scanner;

public class getFibonacci {
    public static void main(String[] args) {
        int i = 0,j=1;
        Scanner s =new Scanner(System.in);
        System.out.println("请输入第n个值");
        int n=s.nextInt();
        int x=Fibonacci(i,j,n);
        System.out.println("第"+n+"个值为"+x);
    }
    public static int Fibonacci(int i, int j, int n){
        int temp = i+j;
        if (1==n) return 0;
        if (n==2) return 1;
        if(n==3)  {
            return temp;
        }
        //System.out.println(temp);
        for (int k = 4; k <=n ; k++) {
            i=j;
            j=temp;
            temp=i+j;

        }
        return temp;
    }

}
