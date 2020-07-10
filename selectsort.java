import java.util.ArrayList;
import java.util.Scanner;

public class selectsort{
    public static void main(String[] args) {
        ArrayList<Integer> l =new ArrayList<Integer>();
        Scanner sca = new Scanner(System.in);
        while (sca.hasNextInt()){
            l.add(sca.nextInt());
        }
        for (int i = 0; i <l.size(); i++) {
            int min=i;
            int temp;
            for (int j = i+1; j < l.size(); j++) {
                if (l.get(j)<l.get(min)){
                    temp=l.get(j);
                    l.set(j,l.get(min));
                    l.set(min,temp);
                }
            }
        }
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
        }

    }
}