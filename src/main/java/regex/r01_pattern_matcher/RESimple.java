package regex.r01_pattern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RESimple {
    public static void main(String[] args) {
        String pattern = "^Q[^u]\\d+\\.";
        String[] input = {
                "QA777. is the next flight. It is on time.",
                "Quack, Quack, Quack!"
        };

        Pattern p = Pattern.compile(pattern);
        for (String s : input) {
            boolean found = p.matcher(s).lookingAt();
            System.out.printf("'%s' %s %s\n", pattern, found?"matches":"doesn't match", s);
        }

        Matcher matcher = Pattern.compile(pattern).matcher(input[0]);
        if (matcher.find()) {
            System.out.printf("%s matches %s\n", input[0], pattern);
        }

        String pattern2 = "Q[^u]\\d+\\.";
        matcher = Pattern.compile(pattern2).matcher("QA777. is the next flight. Please onboard QA777.");
        while (matcher.find()) {
            System.out.println("matched");
        }
    }
}
