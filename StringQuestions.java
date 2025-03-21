import java.util.Scanner;

public class StringQuestions {
    // Question 1 - Check if the String is palindrome or not
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Question 2 - Shortest Path
    public static float shortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        // // Implementation
        // String name = "Vaibhav";
        // String name1 = new String("Vaibhav");
        // System.out.println(name);
        // System.out.println(name1);

        // // Input Output
        // Scanner sc = new Scanner(System.in);
        // // for single string
        // // String name2 = sc.next();
        // // System.out.println(name2);
        // // for multiple string
        // // String name3 = sc.nextLine();
        // // System.out.println(name3);

        // // String Length
        // System.out.println("The length of " + name + " is: " + name.length()); //
        // output: 7

        // // String Concatenation
        // String firstName = "Vaibhav";
        // String lastName = "Vishesh";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // // CharAt - Character At
        // System.out.println(fullName.charAt(3)); // output: b

        // // Palindrome
        // String str = "Vaibhav";
        // System.out.println(isPalindrome(str));
        // sc.close();

        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // System.out.println(shortestPath(str));
        sc.close();

        String str1 = "Vaibhav";
        String str2 = "Vishesh";
        if (str1.equals(str2)) {
            System.out.println("str1 is equal to str2");
        } else {
            System.out.println("str1 is not equal to str2");
        }
    }
}
