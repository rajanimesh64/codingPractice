package coding;


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

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer,Integer> tmpresult = new HashMap<>();
        List<Integer> result= new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            int operation=queries.get(i).get(0);
            int data=queries.get(i).get(1);
            if(operation == 1){
                if(tmpresult.containsKey(data)){
                    int val=tmpresult.get(data);
                    tmpresult.put(data, val+1);
                }else{
                    tmpresult.put(data,1);
                }
            } else if(operation == 2){
                if(tmpresult.containsKey(data)){
                    int val=tmpresult.get(data);
                    tmpresult.put(data, val-1);
                }
            } else if(operation == 3){
                if(tmpresult.values().contains(data)){
                    result.add(1);
                }else{
                    result.add(0);
                }
            }
        }
        
 return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/animesh/git/codingPractice/coding/src/coding/inp.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/animesh/git/codingPractice/coding/src/coding/out.txt"));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
