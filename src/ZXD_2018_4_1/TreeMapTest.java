package ZXD_2018_4_1;

import java.util.*;

public class TreeMapTest{
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        TreeMap<Integer,String> treemap = new TreeMap<Integer, String>();
        HashMap<Integer,String> hashmap = new HashMap<Integer,String>();

        treemap.put(1234, "北京");
        treemap.put(345, "南京");
        treemap.put(664, "秦皇岛");
        treemap.put(1266, "济南");
        treemap.put(178, "天津");
        treemap.put(1789, "上海");
        treemap.put(1023, "苏州");

        hashmap.put(1234, "北京");
        hashmap.put(345, "南京");
        hashmap.put(664, "秦皇岛");
        hashmap.put(1266, "济南");
        hashmap.put(178, "天津");
        hashmap.put(1789, "上海");
        hashmap.put(1023, "苏州");

        System.out.println("******************TreeMap Output******************");
        Scanner sc = new Scanner(System.in);
        System.out.println("循环打印几次");
        int n = sc.nextInt();
        for(int i = 0; i < n;i++){
        Set<Map.Entry<Integer,String>> entrySet = treemap.entrySet();
        for(Map.Entry<Integer,String> ent : entrySet){

            System.out.print(ent.getValue() + " " + ent.getKey() + "  ");
            }
            System.out.println("  ");
        }


        System.out.println("******************HashMap Output***********************");

        Set<Map.Entry<Integer,String>> entrySet1 = hashmap.entrySet();
        System.out.println("循环打印几次");
        int n1 = sc.nextInt();
        for(int i = 0; i < n1;i++){
        for(Map.Entry<Integer,String> ent : entrySet1){
            System.out.print(ent.getValue() + " " + ent.getKey() + "  ");
        }
            System.out.println(" ");
        }
        sc.close();
    }
}
