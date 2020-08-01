package git;

public class reOrderArray {
    public static void main(String[] args) {
        int[] array={3,4,2,5,7,6,1,8};

        reRrder(array);
        for (int a:array
             ) {
            System.out.print(a+" ");
        }
    }

    private static void reRrder(int[] a) {
        if (a==null||a.length==0) return;
        for (int i = 1; i <a.length ; i++) {
            int j=i-1;
            while (j>=0){
                    if (a[j]%2!=0)
                        break;
                    if (a[j]%2==0){
                        int t=a[j+1];
                        a[j+1]=a[j];
                        a[j]=t;
                        j--;
                    }
                }
            }

        }
    }


