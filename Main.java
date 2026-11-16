

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        Arrays.sort(weights);

        int left = 0;
        int right = n - 1;
        int boats = 0;

        while (left <= right) {
            if (weights[left] + weights[right] <= d) {
                left++;
            }
            right--;
            boats++;
        }

        System.out.println(boats);
        scanner.close();
    }
}