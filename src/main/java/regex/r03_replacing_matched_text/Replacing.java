package regex.r03_replacing_matched_text;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Replacing {
    public static void main(String[] args) {
        String pattern = "\\bfavor\\b";
        String input = "Do me a favor? Fetch my favorite.";
        System.out.printf("Input: %s\n", input);

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);
        System.out.printf("ReplaceAll: %s\n", matcher.replaceAll("favour"));

        matcher.reset();
        StringBuffer sb = new StringBuffer();
        System.out.printf("Append methods: ");
        while (matcher.find()) {
            matcher.appendReplacement(sb, "favour");
        }
        matcher.appendTail(sb);
        System.out.printf("%s\n", sb.toString());
    }
}
