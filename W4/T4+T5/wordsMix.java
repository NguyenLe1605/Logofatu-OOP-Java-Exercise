import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class wordsMix {
    public static void main(String[] args) throws Exception {
        File sampleFile = new File("text_in.txt");
        Scanner myReader = new Scanner(sampleFile);
        String[] sampleArray = myReader.nextLine().split(" ");
        List<String> sampleList = Arrays.asList(sampleArray);
        List<String> completeString = new ArrayList<String>();
        for (String sample : sampleList) {
            if (sample.length() > 3) {
                List<Character> list = new ArrayList<Character>();
                for (int i = 1; i < sample.length() - 1; i++) {
                    list.add(sample.charAt(i));
                }
                Collections.shuffle(list);
                list.add(0, sample.charAt(0));
                list.add(sample.charAt(sample.length() - 1));
                String result = new String();
                for (Character j : list) {
                    result += j;
                }
                completeString.add(result);
            } else {
                completeString.add(sample);
            }
        }
        myReader.close();
        String result = "";
        for (String content : completeString) {
            result += content + " ";
        }
        FileWriter sampleOut = new FileWriter("text_out.txt");
        sampleOut.write(result);
        sampleOut.close();
        System.out.println(result);
    }
}