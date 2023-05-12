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



        public static String timeConversion(String s) {
            String[] parts = s.split(":");
            int hour = Integer.parseInt(parts[0]);
            String minutes = parts[1];
            String seconds = parts[2].substring(0, 2);
            String period = parts[2].substring(2);

            if (hour == 12) {
                hour = 0;
            }

            if (period.equalsIgnoreCase("PM")) {
                hour += 12;
            }

            String newHour = String.format("%02d", hour);

            return newHour + ":" + minutes + ":" + seconds;


        }

    }

    public class Main {
        public static void main(String[] args) throws IOException {


            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = bufferedReader.readLine();

            String result = Result.timeConversion(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }


}