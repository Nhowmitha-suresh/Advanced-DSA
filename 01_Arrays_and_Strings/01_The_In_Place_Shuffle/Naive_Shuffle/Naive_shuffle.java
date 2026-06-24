import java.util.Random;
import java.util.Arrays;

public class Naive_shuffle {

    static void random(int arr[], int n) {
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            int j = r.nextInt(n);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        random(arr, arr.length);
    }
}