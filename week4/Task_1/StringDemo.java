public class StringDemo {
    public static void main(String[] args) {
        String testcase = "rekyrtS si eman yM";
        int length = testcase.length();
        char[] tempArray = new char[length];
        char[] Array = new char[length];

        for (int i = 0; i < length; i++) {
            tempArray[i] = testcase.charAt(i);
        }

        for (int i = 0; i < length; i++) {
            Array[i] = tempArray[length - i - 1];
        }

        String result = new String(Array);
        System.out.println(result);
    }
}
