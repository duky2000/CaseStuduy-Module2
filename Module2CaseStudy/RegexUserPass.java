package Module2CaseStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserPass {
    public static final String userRegex = "[^\\s]+";

    public RegexUserPass() {
    }

    public static boolean check(String regex) {
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
