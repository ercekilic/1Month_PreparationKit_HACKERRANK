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
     * Complete the 'pangrams' function below.
     *  z harfi 35
     *  a harfi 10
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {


        int toplam = 0 ;
        int y = s.length();
        y = y-1;
            for (int i = 10; i<= 35 ; ){

                for (int z = 0 ; z<s.length() ; z++){

                    if( i==Character.getNumericValue(s.charAt(z))){
                        System.out.println(i);
                        toplam = toplam + i;
                        i++;
                }

                }

            }
        if (toplam==585){
            s = "pangram";
        }
        else s = "not paragram";


        return s;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}