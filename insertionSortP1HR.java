import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class insertionSortP1HR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Resultt.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
class Resultt {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int tmp = arr.get(n-1);
        int i;
        for (i = n-2;i>-1&&arr.get(i) > tmp;i--) {
            arr.set(i+1, arr.get(i));
            print(arr);
        }
        arr.set(i+1, tmp);
        print(arr);

    }
    public static void print (List<Integer> arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

}