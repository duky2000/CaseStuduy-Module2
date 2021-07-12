package Module2CaseStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGender {
    public static final String gender = "^[Nn][Aa][Mm]+|[Nn][Uu]$";

    public static boolean check(String regex) {
        Pattern pattern = Pattern.compile(gender);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
