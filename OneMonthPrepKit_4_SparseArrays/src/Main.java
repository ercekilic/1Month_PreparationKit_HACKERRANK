import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for (String query : queries) {
            int count = 0;
            for (String string : strings) {
                if (string.equals(query)) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }

}
public class Main {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            List<Integer> res = Result.matchingStrings(strings, queries);

            bufferedWriter.write(
                    res.stream()
                            .map(Object::toString)
                            .collect(joining("\n"))
                            + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();

    }
}