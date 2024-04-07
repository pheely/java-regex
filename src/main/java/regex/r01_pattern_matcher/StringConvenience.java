package regex.r01_pattern_matcher;

public class StringConvenience {
    public static void main(String[] args) {
        String pattern = ".*Q[^u]\\d+\\..*";
        String line = "Order QT300. Now!";
        if (line.matches(pattern)) {
            System.out.printf("%s matches %s\n", line, pattern);
        } else {
            System.out.printf("NO MATCH\n");
        }
    }
}
