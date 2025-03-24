public class BitManipulation {

    // Quesion 1 - Check if the number is odd or even.
    public static void oddOreven(int num) {
        int numCheck = 1;
        if ((num & numCheck) == 0) {
            System.out.println(num + " - Even Number");
        } else {
            System.out.println(num + " - Odd Number");
        }
    }

    public static void main(String[] args) {
        System.out.println(5 & 6); // Binary AND (&) Output - 4
        System.out.println(5 | 6); // Binary OR (|) Output - 7
        System.out.println(5 ^ 6); // Binary XOR (^) Output - 3
        System.out.println(~5); // Binary One's Complement (~) Output - (-6)
        System.out.println(5 << 2); // Binary Left Shift (<<) Output - 20
        System.out.println(6 >> 1); // Binary Right Shift (>>) Output - 3
        oddOreven(3);
        oddOreven(11);
        oddOreven(14);
    }
}
