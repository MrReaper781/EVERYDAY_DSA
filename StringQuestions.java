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

    public static void substring(String str, int si, int ei) {
        for (int i = si; i < ei; i++) {
            System.out.print(str.charAt(i));
        }
    }

    // Question 3 - For a given set of string print the largest string
    public static void largestString(String words[]) {
        String largest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (largest.compareToIgnoreCase(words[i]) < 0) {
                largest = words[i];
            }
        }
        System.out.println("The largest string is: " + largest);
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

        substring(str2, 0, 4);
        System.out.println("\n" + str2.substring(0, 5));

        String fruits[] = { "apple", "banana", "mango", "Papaya", "pomegrenate", "guava", "watermelon" };
        largestString(fruits);
    }
}
