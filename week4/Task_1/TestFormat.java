import java.util.Calendar;
import java.util.Locale;

public class TestFormat {
    public static void main(String[] args) {
        long testcase_1 = 21038293;
        System.out.format("%d%n", testcase_1);
        System.out.format("%010d%n", testcase_1);
        System.out.format("%+8d%n", testcase_1);
        System.out.format("%,8d%n", testcase_1);
        System.out.format("%+,08d%n%n", testcase_1);

        double testcase_2 = Math.PI;
        System.out.format("%f%n", testcase_2);
        System.out.format("%.5f%n", testcase_2);
        System.out.format("%10.5f%n", testcase_2);
        System.out.format("%-10.5f%n", testcase_2);
        System.out.format(Locale.FRANCE, "%-10.5f%n%n", testcase_2);

        Calendar testcase_3 = Calendar.getInstance();
        System.out.format("%tB %td, %tY%n", testcase_3, testcase_3, testcase_3);
        System.out.format("%tl:%tM %tp%n", testcase_3, testcase_3, testcase_3);
        System.out.format("%tD%n", testcase_3);
    }
}
