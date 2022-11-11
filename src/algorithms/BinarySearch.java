package algorithms;

public class BinarySearch {

    public static int search(String[] a, String word) {
        System.out.println("Binary search");
        int complexity = 0;
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            complexity++;
            int mid = left + (right - left) / 2;

            if (a[mid].compareTo(word) < 0) {
                left = mid + 1;
            } else if (a[mid].compareTo(word) > 0) {
                right = mid - 1;
            } else {
                System.out.println("complexity: " + complexity);
                return mid;
            }

        }

        System.out.println("complexity: " + complexity);
        return -1;
    }
}
