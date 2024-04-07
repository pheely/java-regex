package regex.r03_replacing_matched_text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacingPortion {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\w+)\\s+(\\w+)");
        String input = "Ian Darwin";
        System.out.printf("Input: %s\n", input);

        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.printf("Replaced: %s\n", matcher.replaceFirst("$2, $1"));
        }
    }
}
