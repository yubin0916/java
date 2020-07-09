import java.util.Scanner;

public class stringtest01 {

    public static void main(String[] args) {
        //Scanner s=new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        String str ="we are happy";
        //System.out.println(str.length());
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == ' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(str.charAt(i));
            }
        }
        System.out.println(stringBuffer);

    }
}
