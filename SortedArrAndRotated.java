import java.util.Scanner;

public class SortedArrAndRotated {
    public static void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + k) % n] = arr[i];
        }
        System.out.print("Rotated Array: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of array to rotated: ");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements in the array below:\n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr, k);
        sc.close();
    }
}