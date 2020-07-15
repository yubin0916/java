package test.java.HotelManageSystem;

import java.util.Scanner;

public class HotelMgtSystem {
    public static void main(String[] args) {
/*        Hotel hotel =new Hotel();
        hotel.print();*/
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("欢迎光临A酒店");
            System.out.println("请选择你所需要的服务？1.订房 2.退房");
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();

            switch (c) {
                case 1:
                    hotel.print();
                    System.out.println("请输入您想订购的房间房号？1.单人间 2.标准间 3.豪华套房");
                    int t = scanner.nextInt();
                    hotel.order(t);
                    break;

                case 2 :
                    System.out.println("请输入您需要退定的房间");
                    int t2 = scanner.nextInt();
                    hotel.exit(t2);
                    break;

                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }


        }
    }
}
