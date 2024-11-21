import java.util.Scanner;

public class Searching_Number {
    public static void disp(int arr[], int x) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) { // Searching An Elemnts In Array
            if (arr[i] == x) {
                idx = i;
                // System.out.println("The Number you Entered is Found In this Array");
                break;

            }

        }
        if (idx == -1) {
            System.out.println("Searched element is not found in an array");
        } else {
            System.out.println("Searched element is found at the location:" + idx);
        }
        // System.out.println("Sorry The Number Is Not Found ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements in an Array :");
        for (int i = 0; i < n; i++) {// We are Entring Array Elements Here..
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a Number You Want to Search in This Array");
        int x = sc.nextInt();
        // We are Printing The array Elements
        System.out.println("You Entered this Array ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        disp(arr, x);
        sc.close();
    }
}