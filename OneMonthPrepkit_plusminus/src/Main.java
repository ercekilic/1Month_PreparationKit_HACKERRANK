
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int negatif=0;
        int pozitif = 0;
        int sifir = 0;
        double len= arr.toArray().length;
        // System.out.println("dizinin uzunluğu = "+ len);
        for (int seco : arr ){
              if(seco<0){
                   negatif++;
              }
              if (seco==0){
                  sifir++;
              }
              if (seco>0){
                  pozitif++;
              }
           // System.out.println(" pozitif = "+ pozitif + " sifir = "+ sifir + " negatif = "+ negatif);




                }
        DecimalFormat df = new DecimalFormat("0.0000000");

        String formatliSayi1 = df.format(pozitif/len);
        String formatliSayi2 = df.format(negatif/len);
        String formatliSayi3 = df.format(sifir/len);
        System.out.println(formatliSayi1);
        System.out.println(formatliSayi2);
        System.out.println(formatliSayi3);
    }

}
public class Main {
    public static void main(String[] args) throws IOException {





        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}