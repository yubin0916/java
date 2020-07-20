package test.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maptest {
    /*
    key和value都是引用数据类型
    key和value都是存储对象的内存地址
     */
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"qwe");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        Set<Integer> keys=map.keySet();
        /*Iterator<Integer> it =keys.iterator();
        String vals;
        while (it.hasNext()) {
            Integer key = it.next();
            vals = map.get(key);
            System.out.println(vals);
        }*/
        for (Integer key :keys
             ) {
            System.out.println(key+"="+map.get(key));
        }

        Set<Map.Entry<Integer,String>> set =map.entrySet();
        //遍历set集合，每一次取出一个node
/*        Iterator<Map.Entry<Integer,String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            Integer key =node.getKey();
            String value = node.getValue();
            System.out.println(key+"="+value);
        }*/
        for (Map.Entry<Integer,String> node:set
             ) {
            System.out.println(node.getKey()+"="+node.getValue());
        }

    }
}
