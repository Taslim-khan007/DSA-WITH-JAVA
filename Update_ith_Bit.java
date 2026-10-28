
public class Update_ith_Bit {

    // Set ith bit to 1
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear ith bit to 0
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update ith bit to 0 or 1
    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);

        int bitMask = newBit << i;

        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
