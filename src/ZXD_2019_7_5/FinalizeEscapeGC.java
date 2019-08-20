/**
 * FileName: FinalizeEscapeGC
 * Author: rbl
 * Date: 2019-7-2 00:56
 **/
package ZXD_2019_7_5;

/**
 * 此代码演示2点:
 * 1.对象可以在被GC时自我拯救
 * 2.这种自救机会只有一次,因为一个对象的finalize()方法最多只会被系统调用一次
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("yes, i am still alive :)");
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws Throwable {
        SAVE_HOOK = new FinalizeEscapeGC();

        //对象第一次成功拯救自己
        SAVE_HOOK = null;
        System.gc();
        //因为finalize()方法优先级很低，所以暂停0.5s以等待它
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no , i am dead:(");
        }

        //对象第二次自救失败，代码完全一致
        SAVE_HOOK = null;
        System.gc();
        //因为finalize()方法优先级很低，所以暂停0.5s以等待它
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no , i am dead:(");
        }
    }
}
