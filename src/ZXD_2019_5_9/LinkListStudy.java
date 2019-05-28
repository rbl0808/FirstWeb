/**
 * FileName: LinkListStudy
 * Author: rbl
 * Date: 2019_5_9
 **/
package ZXD_2019_5_9;

import model.Person;

import java.util.LinkedList;
import java.util.List;

public class LinkListStudy {
    public static void main(String[] args) {
        List<Person> list1 = new LinkedList<Person>();

        list1.add(new Person("赵一", "17"));
        list1.add(new Person("钱二", "18"));
        list1.add(new Person("孙三", "19"));
        list1.add(new Person("李四", "20"));
        list1.add(new Person("周五", "21"));
        list1.add(new Person("吴六", "22"));
        list1.add(new Person("政七", "23"));
        list1.add(new Person("王八", "24"));
        list1.add(new Person("张九", "25"));

        System.out.println("remove之前:" + list1.size());
        list1.remove(new Person("吴六", "22"));
        System.out.println("remove之后:" + list1.size());
    }
}
