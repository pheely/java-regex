package regex.r03_replacing_matched_text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class ReplacingAll {
    public static void main(String[] args) {
        Pattern patter = Pattern.compile("cat|dog");
        String line = "The cat and the dog neve get along well.";
        System.out.printf("Input: %s\n", line);
        Matcher matcher = patter.matcher(line);
        while (matcher.find()) {
            String found = matcher.group(0);
            String replacement = computeReplacement(found);
            line = matcher.replaceFirst(replacement);
            matcher.reset(line);
        }
        System.out.printf("Final: %s\n", line);
    }

    static String computeReplacement(String input) {
        switch (input) {
            case "cat": return "feline";
            case "dog": return "canine";
            default: return "animal";
        }
    }
}
