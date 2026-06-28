import java.util.Random;
import java.util.Scanner;

public class NaiveShuffle {

    public static void naiveShuffle(int[] arr) {

        Random random = new Random();
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int j = random.nextInt(n);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        naiveShuffle(arr);

        System.out.println("Naively Shuffled Array:");

        for (int x : arr)
            System.out.print(x + " ");

        sc.close();
    }
}