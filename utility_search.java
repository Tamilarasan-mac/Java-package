import java.util.Arrays;

public class utility_search {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};

        int index = Arrays.binarySearch(a, 30);
        System.out.println("Index = " + index);
    }
}