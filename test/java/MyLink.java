package test.java;


import java.util.Random;

public class MyLink {
    Node head = null;  //头节点

    class Node{
        Node next =null;
        int data;
        public Node(int data){
            this.data=data;
        }
    }

    //插入数据
    public void addNode(int d){
        Node newNode = new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        Node tmp=head;
        while (tmp.next != null){
            tmp=tmp.next;
        }
        tmp.next=newNode;
    }

    //删除第index个节点
    public boolean deleteNode(int index){
        if (index<1 || index>length()){
            return false;
        }
        if (index==1){
            head=head.next;
            return true;
        }
        int i=1;
        Node perNode =head;
        Node curNode =perNode.next;
        while (curNode != null){
            if (i==index){
                perNode.next=curNode.next;
            }
            perNode =curNode;
            curNode = perNode.next;
            i++;
        }
        return false;
    }

    public int length(){
        int length=0;
        Node tmp = head;
        while (tmp != null){
            length++;
            tmp=tmp.next;
        }
        return length;
    }
    public void  printlink(){
        Node tmp =head;
        while (tmp !=null){
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
    }


    public static void main(String[] args) {
        Random random =new Random();
        MyLink myLink =new MyLink();
        for (int i = 0; i <5 ; i++) {
            myLink.addNode(random.nextInt(30));
        }
        System.out.println(myLink.length());
        myLink.printlink();
        myLink.deleteNode(3);
        System.out.println();
        myLink.printlink();


    }

}
