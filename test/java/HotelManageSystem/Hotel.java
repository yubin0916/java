package test.java.HotelManageSystem;

public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        //三层，一层单人间，二层标准间，三层豪华套房
        rooms = new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                } else if (i == 1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", true);
                } else {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "豪华套房", true);
                }
            }

        }

    }
    public void print(){
        for (int i = 0; i <rooms.length; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
                Room room=rooms[i][j];
                System.out.print(room);//重写的toString方法
            }
            System.out.println();
        }
    }
    public void order(int roomNo){
        Room room = rooms[roomNo /100 -1][roomNo %100 -1];
        room.setStatus(false);
        System.out.println("您已预订"+roomNo+"成功");
    }
    public  void exit(int roomNo){
        Room room = rooms[roomNo /100-1][roomNo %100 -1];
        room.setStatus(true);
        System.out.println("您已退房"+roomNo+"成功");

    }
}