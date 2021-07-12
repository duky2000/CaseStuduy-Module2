package Module2CaseStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexName {
    public static final String name = "^[^\\d]+$";

    public static boolean check(String regex) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
