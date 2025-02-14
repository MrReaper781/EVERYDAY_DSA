import java.util.Scanner;

public class Rotation {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotatedArr = new int[n];

        // Rotating array
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + k) % n] = nums[i];
        }

        // Printing rotated array
        System.out.print("Rotated array: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements in array below: \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the rotation value: ");
        int k = sc.nextInt();

        // Create an object of Rotation and call rotate method
        Rotation rotationObj = new Rotation();
        rotationObj.rotate(arr, k);

        sc.close();
    }
}
