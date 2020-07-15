package test.java.HotelManageSystem;

public class Room  {
    //房间号
    private int no;
    //房间类型
    private String type;
    //房间状态
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Room)) return false;
        if (this==obj) return true;
        Room room=(Room)obj;
        return this.no==room.getNo();
    }


    @Override
    public String toString() {
        //动态，把变量塞到一个字符串当中，一个双引号，双引号中加俩加号，加号中加变量名
        return "["+no+","+type+","+(status ? "空闲" : "占用")+"]";
    }


}
