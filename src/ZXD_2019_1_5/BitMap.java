package ZXD_2019_1_5;
/*
2019-1-5 00：02
 */
public class BitMap {
    //保存数据
    private byte[] bits;

    //能够存储多少数据
    private int capacity;

    public BitMap(int capacity){
        this.capacity = capacity;

        //1bit能存储8个数据，那么capacity数据需要多少个bit呢，capacity/8+1,右移3位相当于除以8
        bits = new byte[(capacity >>3 )+1];
    }

    /**
     * 插入
     * @param num
     */
    public void add(int num){
        // num/8 得到byte[]的index
        int arrayIndex = num >> 3;

        // num%8 得到在byte[index]的位置
        int position = num & 0x07;

        // 将1左移position后，那个位置自然就是1，然后和以前的数据做|，这样，那个位置就被替换成1了

        bits[arrayIndex] |= 1<<position;
    }

    /**
     * 清除
     * @param num
     */
    public void clear(int num){
        // num/8 得到byte[]的index
        int arrayIndex = num >> 3;

        // num%8 得到在byte[index]的位置
        int position = num & 0x07;

        //将1左移position后，那个位置自然就是1，然后对取反，再与当前值做&，即可清除当前的位置了.
        bits[arrayIndex] &= ~(1 << position);
    }

    /**
     * 是否存在
     * @param num
     * @return
     */
    public boolean contain(int num){
        // num/8得到byte[]的index
        int arrayIndex = num >> 3;

        // num%8得到在byte[index]的位置
        int position = num & 0x07;

        //将1左移position后，那个位置自然就是1，然后和以前的数据做&，判断是否为0即可
        return (bits[arrayIndex] & (1 << position)) !=0;
    }

    public static void main(String[] args) {
/*
        BitMap bitMap = new BitMap(100);
        bitMap.add(7);
        System.out.println("插入成功");

        boolean isexsit = bitMap.contain(7);
        System.out.println("7是否存在:" + isexsit);

        bitMap.clear(7);
        isexsit = bitMap.contain(7);
        System.out.println("7是否存在:" + isexsit);
*/

        BitMap bitMap = new BitMap(1000);

        int[] arr = {1,2,5,3,22,455,222,44};

        for (int i = 0;i < arr.length; i++){
            bitMap.add(arr[i]);
        }

        for(int i = 0;i<1000;i++){
            if(bitMap.contain(i))
                System.out.print(i + " ");
        }
    }
}
