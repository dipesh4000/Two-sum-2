import java.util.Arrays;
public class Search {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4};

    }
    public int[] twoSum(int[] numbers, int target) {

        for (int i  = 0; i < numbers.length ; i++) {
            int s = i +  1;
            int e = numbers.length - 1;
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (numbers[i] + numbers[m] == target) return new int[]{i + 1, m + 1};
                if (numbers[i] + numbers[m] > target) e = m - 1;
                if (numbers[i] + numbers[m] < target) s = m + 1;
            }
        }
        return new int[]{-1, -1};
    }
}






























