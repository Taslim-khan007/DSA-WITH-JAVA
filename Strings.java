public class Strings {

    // String CharAt Lecture
    public static void PrintLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String args[]) {

        // Input - Output Lecture
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your full name: ");
        // String name = sc.nextLine();
        // System.out.println("Your name is: " + name);
        // sc.close();

        // String Length Lecture
        // String name = "John Doe";
        // System.out.println("Length of the string: " + name.length());

        // String Concatenation Lecture
        // String firstName = "John";
        // String lastName = "Doe";
        // String fullName = firstName + " " + lastName;
        // System.out.println("Full name: " + fullName);

        // String CharAt Lecture
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        PrintLetters(fullName);

    }
}