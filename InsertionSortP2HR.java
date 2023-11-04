import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Resulttt {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1;i<n;i++) {

            for (int j = i;j>0&&less(arr.get(j), arr.get(j-1));j--) {
                swap(arr, j, j-1);
            }
            for (int k = 0;k<n;k++) System.out.print(arr.get(k)+" ");
            System.out.println();
        }

    }
    public static boolean less(int a, int b) {
        return a < b;
    }
    public static void swap(List<Integer> arr, int i, int j) {
        int tmp = arr.get(j);
        arr.set(j, arr.get(i));
        arr.set(i, tmp);
    }

}

public class InsertionSortP2HR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Resulttt.insertionSort2(n, arr);

        bufferedReader.close();
    }
}
