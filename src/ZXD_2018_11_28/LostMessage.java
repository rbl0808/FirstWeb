package ZXD_2018_11_28;
//异常丢失

class VeryImportantException extends Exception{
    public  String toString(){
        return "A very important exception!";
    }
}

class HoHumException extends Exception{
    public  String toString(){
        return  "A trivial exception!";
    }
}
public class LostMessage {
    void f() throws VeryImportantException{
        throw new VeryImportantException();
    }

    void dispose() throws  HoHumException{
        throw new  HoHumException();
    }

    public static void main(String[] args) {
        String a = "123123214 ";
        String b = "123123214";
        System.out.println(a.equals(b));
        try{
            LostMessage lm = new LostMessage();
            try{
                lm.f();
            }finally {
                lm.dispose();
            }
        }catch (Exception e){
                System.out.println(e);
            }
        }
    }


