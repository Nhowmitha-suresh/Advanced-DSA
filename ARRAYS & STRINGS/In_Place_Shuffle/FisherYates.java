import java.util.Random;
import java.util.Scanner;

public class FisherYates {

    public static void shuffle(int[] arr) {

        Random random = new Random();

        for (int i = arr.length - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

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

        shuffle(arr);

        System.out.println("Shuffled Array:");

        for (int x : arr)
            System.out.print(x + " ");

        sc.close();
    }
}