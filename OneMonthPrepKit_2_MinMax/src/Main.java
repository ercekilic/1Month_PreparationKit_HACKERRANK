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


class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long geciciMAX = Long.MAX_VALUE;
        Long geciciMIN = Long.MIN_VALUE;
        long toplam2 = 0;
        for(long sayilar  : arr ){

            if(sayilar>geciciMIN){
                geciciMIN = sayilar;
            }
            toplam2 = toplam2 + sayilar;
            // System.out.println(toplam);
        }
        toplam2 = toplam2 - geciciMIN ;

        System.out.print(toplam2+" ");

        long toplam = 0;
        for(long sayilar  : arr ){
            if(sayilar<geciciMAX){
                geciciMAX = sayilar;
            }
            toplam = toplam + sayilar;


        }
        long toplam1 =  toplam - geciciMAX ;

        System.out.print(toplam1);

    }


public class Main {



    }
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}