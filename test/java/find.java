import java.util.Scanner;


public class find {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[][] array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};

        findn(n,array);


    }
    private static boolean findn(int num,int [][] Array)
    {
        int i=0;
        int j=Array[0].length-1;
        /*
        相等则返回
        num大行增加
        num小列减少
         */
        while(i<Array[0].length && j>=0){
            if (Array[i][j] == num){
                System.out.println("此值第一次找到在第"+i+"行,第"+j+"列");
                return true;
            }
            else if (num>Array[i][j]){
                i++;
            }
            else j--;
        }
        return false;


    }

}
