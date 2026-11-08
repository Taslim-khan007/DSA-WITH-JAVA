public class Fast_Exponentiation {
    public class BitManipulation {

        public static int fastExpo(int a, int n) {
            int ans = 1;

            while (n > 0) {

                // Check LSB
                if ((n & 1) != 0) {
                    ans = ans * a;
                }

                // Square the base
                a = a * a;

                // Divide n by 2
                n = n >> 1;
            }

            return ans;
        }

        public static void main(String args[]) {
            System.out.println(fastExpo(3, 5));
        }
    }
}
