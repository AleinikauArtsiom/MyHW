package Lessons12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hm2 {
    public static void main(String[] args) {
        String info = "  My number +111(202)555-0125  my email foobar@gmail.com my document 4567-2467-31 ";

        Pattern patternPhone = Pattern.compile("\\+\\d{3}\\(\\d{3}\\)\\d{3}-\\d{4}");
        Pattern patternEmail = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b", Pattern.CASE_INSENSITIVE);
        Pattern patternDocument = Pattern.compile("(\\d{4}-){2}\\d{2}");

        Matcher matcherPhone = patternPhone.matcher(info);
        Matcher matcherEmail = patternEmail.matcher(info);
        Matcher matcherDocument = patternDocument.matcher(info);

        while (matcherPhone.find()) {
            System.out.println("Phone: " + matcherPhone.group());
        }
        while (matcherEmail.find()) {
            System.out.println("Email: " + matcherEmail.group());
        }
        while (matcherDocument.find()) {
            System.out.println("Document: " + matcherDocument.group());
        }
    }
}
