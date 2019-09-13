package ZXD_2018_4_1;

import org.junit.Test;

public class JavaFaceTest {
    @Test
    public void Ttest1() {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s5);//true
        System.out.println(s1 == s6);//false
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
    }}
    //类继承 和加载
    class A {
        static {
            System.out.print("1");
        }

        public A() {
            System.out.print("2");
        }
    }

    class B extends A {
        static {
            System.out.print("a");
        }
        public B() {
            System.out.print("b");
        }
    }
//1a2b2b
    class C{
        public static void main(String[] args) {
            A ab = new B();
            ab = new B();
        }
    }

    //异常类处理
    class Annoyance extends Exception {}
    class Sneeze extends Annoyance {}

    class Human {

    public static void main(String[] args)
            throws Exception {
        try {
            try {
                throw new Sneeze();
            }
            catch ( Annoyance a ) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        }
        catch ( Sneeze s ) {
            System.out.println("Caught Sneeze");
            return ;
        }
        finally {
            System.out.println("Hello World!");
        }
    }
}

