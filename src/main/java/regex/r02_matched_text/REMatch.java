package regex.r02_matched_text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REMatch {
    public static void main(String[] args) {
        String[] patterns = {
            "Q[^u]\\d+\\.",
            "(.*), (.*)"
        };
        String[] lines = {
            "Order QT300. Now!",
            "Thoreau, Henry David"
        };

        for (int i = 0; i < patterns.length; i++) {
            findMatchedText(patterns[i], lines[i]);
        }
    }

    private static void findMatchedText(String pattern, String line) {
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(line);
        System.out.printf("Pattern: %s\tString: %s\n", pattern, line);
        if (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                String matched = matcher.group(i);
                System.out.printf("%d [%d, %d]: %s\n", i, matcher.start(i), matcher.end(i), matched);
            }
        } else {
            System.out.printf("NO MATCH\n");
        }
    }
}