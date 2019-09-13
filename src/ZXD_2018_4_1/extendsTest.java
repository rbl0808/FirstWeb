
package ZXD_2018_4_1;


 class A1 {
    public String show(D1 obj) {
        return ("A and D");
    }
    public String show(A1 obj) {
        return ("A and A");
    }
}

class B1 extends A1{
    public String show(B1 obj){
        return ("B and B");
    }

    public String show(A1 obj){
        return ("B and A");
    }
}

class C1 extends B1{

}
class D1 extends B1{

}

public class extendsTest {


    public static void main(String[] args) {
        A1 a1 = new A1();
        A1 a2 = new B1();
        B1 b1 = new B1();
        C1 c1 = new C1();
        D1 d1 = new D1();

        System.out.println("1--a1.show(b1)=" + a1.show(b1));// a and a
        System.out.println("2--a1.show(c1)=" + a1.show(c1));// a and a
        System.out.println("3--a1.show(d1)=" + a1.show(d1));//a and d
        System.out.println("4--a2.show(b1)=" + a2.show(b1));//b and b
        System.out.println("5--a2.show(c1)=" + a2.show(c1));//         b and a
        System.out.println("6--a2.show(d1)=" + a2.show(d1));//a and d
        System.out.println("7--b1.show(b1)=" + b1.show(b1));//b and b
        System.out.println("8--b1.show(c1)=" + b1.show(c1));//b and b
        System.out.println("9--b1.show(d1)=" + b1.show(d1));//          a and d
    }
}

