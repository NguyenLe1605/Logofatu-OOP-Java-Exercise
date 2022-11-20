import java.util.*;
import java.io.File;
import java.util.Scanner;

public class wordsMixandCompared {
    static boolean wordsShuffle(List<String> test1, List<String> test2) {
        boolean check = false;
        for (int i = 0; i < test1.size(); i++) {
            String contentTest1 = test1.get(i);
            String contentTest2 = test2.get(i);
            int wordSize = contentTest1.length();
            for (int j = 0; j < contentTest1.length(); j++) {
                if ((contentTest1.charAt(0) == contentTest2.charAt(0))
                        && (contentTest1.charAt(wordSize - 1) == contentTest2.charAt(wordSize - 1))) {
                    check = true;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) throws Exception {
        File sampleFile_1 = new File("text_in_1.txt");
        Scanner myReader_1 = new Scanner(sampleFile_1);
        File sampleFile_2 = new File("text_in_2.txt");
        Scanner myReader_2 = new Scanner(sampleFile_2);

        List<String> sampleList_1 = Arrays.asList(myReader_1.nextLine().split(" "));
        List<String> sampleList_2 = Arrays.asList(myReader_2.nextLine().split(" "));

        myReader_1.close();
        myReader_2.close();

        System.out.println(wordsShuffle(sampleList_1, sampleList_2) ? "YES" : "NO");
    }
}