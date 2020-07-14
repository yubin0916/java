package test.java;
/*
使用一维数组模拟栈数据方法
 */

public class Mystack {
    private Object[] elements;//存储java中的任何引用类型的数据
    private int index;//栈帧，指向顶部元素


    public Mystack() {
        this.elements = new Object[10];
        this.index = -1;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /*
    压栈方法，
     */
    public void push(Object o) {
        if (this.index >= elements.length - 1) {
            System.out.println("栈已满，程序结束，压栈失败");
            return;
        }
        this.index++;
        this.elements[index] = o;
        //所有的输出方法执行时，如果输出引用的话，自动调用引用的toString方法
        System.out.println("压栈" + o + "成功，栈帧指向" + index);

    }

    /*
    出栈
     */
    public void pop(Object o) {
        if (this.index < 0) {
            System.out.println("栈已空，程序结束，出栈失败");
            return;
        }
        System.out.print("弹栈"+elements[index]+"成功,");
        this.index--;
        System.out.println("栈帧指向"+index);

    }
}