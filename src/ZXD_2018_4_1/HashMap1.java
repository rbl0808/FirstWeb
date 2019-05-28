package ZXD_2018_4_1;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap1 {
public static void  main(String[] args){
    HashMap hashMap1 = new HashMap();
    hashMap1.put("name","zxd");
    hashMap1.put("name","rbl");
    hashMap1.put(" ","rbl");
    //取得key
    Set key =hashMap1.keySet();
    Set entrySet = hashMap1.entrySet();
    System.out.println(hashMap1.get(key));
    System.out.println("key=" + key + " " + "entrySet="+ entrySet);
    Hashtable hashtable1 = new Hashtable();
    hashtable1.put("name","zxd");
    hashtable1.put("name","rbl");
    hashtable1.put(" ","我是你爸爸");
    String s1 = (String) hashMap1.get("name");
    String s2 = (String) hashMap1.get(" ");
    String s3 = (String) hashtable1.get("name");
    String s4 = (String) hashtable1.get(" ");

    System.out.println(s3+s4);

    ArrayList<Object> arrayList = new ArrayList<Object>();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    Vector<Integer> vector = new Vector<Integer>();

    for (int i = 0;i<20;i++){
        arrayList.add(i);
    }
    //乱序
    Collections.shuffle(arrayList);
    System.out.println(arrayList);
    //排序
    arrayList.sort(Comparator.comparing(Object::hashCode));
    System.out.println(arrayList);

    HashSet<Integer> hashSet = new HashSet<Integer>();
    TreeSet<Integer> treeSet = new TreeSet<Integer>();

    HashMap hashMap = new HashMap();
    TreeMap treeMap = new TreeMap();

    Object o = new Object();
    String a ="asd";

    Thread thread1 = new Thread(){
        @Override
        public void run() {
            super.run();
           // System.out.println("我是一个线程");
            //System.out.println(this.getName() + "线程的状态:" + this.getState());

        }
    };
    thread1.start();

    int  x = 1;
    double d1 = 0.1;
    double d2 = 0.2;
    System.out.println(d1 + d2);
    System.out.println((d1 + d2 == 0.3));


    String s11 = "1";
    String s22 = "0123456789";
    System.out.println(s22.contains(s11));

    System.out.println("2018年8月30日00:07:44 *******************************");
    Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
    for (Thread t : map.keySet()) {
        StackTraceElement[] frames = map.get(t);
        System.out.println(frames);
//        analyze frames
    }

    ConcurrentHashMap map2 = new ConcurrentHashMap();

}

}
