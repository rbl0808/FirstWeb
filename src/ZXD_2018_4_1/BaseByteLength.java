package ZXD_2018_4_1;

import java.util.Date;

public class BaseByteLength {
    private static void baseSize() {
        System.out.println("int: " + Integer.SIZE/8);           // 4
        System.out.println("short: " + Short.SIZE/8);               // 2
        System.out.println("long: " + Long.SIZE/8);                 // 8
        System.out.println("float: " + Float.SIZE/8);               // 4
        System.out.println("double: " + Double.SIZE/8);             // 8
        System.out.println("byte: " + Byte.SIZE/8);                 // 1
        System.out.println("char: " + Character.SIZE/8);       // 2
        System.out.println("boolean: " + Boolean.toString(false));

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BaseByteLength basesize= new BaseByteLength();
        BaseByteLength.baseSize();
        char c = '方';
        System.out.println(c);
        Date date = new Date();
    }
}
