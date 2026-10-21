
public class comparesString {
    public static void main(String args[]) {

        String s1 = "Tony";
        // String s2 = "Tony";
        String s3 = new String("Tony");

        // Using ==
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Using .equals()
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
