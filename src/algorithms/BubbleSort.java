package algorithms;

public class BubbleSort {

    public static void sort(String[] a) {
        System.out.println("Bubble sort");
        int complexity = 0;
        int exchanges = 0;
        for (int i = 0; i < a.length; i++) {
            int jExch = 0;
            for (int j = 0; j < a.length-i-1; j++) {
                complexity++;
                if (a[j].compareTo(a[j+1]) > 0) {
                    exchange(a, j, j+1);
                    exchanges++;
                    jExch++;
                }
            }
            if (jExch == 0) {
                break;
            }
        }

        System.out.println("complexity: " + complexity);
        System.out.println("exchanges: " + exchanges);
    }

    private static void exchange(String[] a, int i1, int i2) {
        String t = a[i1];
        a[i1] = a[i2];
        a[i2] = t;
    }
}
