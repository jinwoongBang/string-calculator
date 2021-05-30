package _02_1_string_calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

  private Pattern separatorPattern = Pattern.compile("((\\\\\\\\).(\\\\n))");

  public int calculate(String valueOfString) {

    if (isEmptyString(valueOfString)) {
      return 0;
    }

    Matcher separatorMatcher = separatorPattern.matcher(valueOfString);

    boolean isStartWithCustomSeparator = separatorMatcher.matches();
    boolean hasColon = valueOfString.contains(":");
    boolean hasComma = valueOfString.contains(",");

    if (isStartWithCustomSeparator) {
      String separator = getSeparator(separatorMatcher);
      String splitString = separatorMatcher.replaceAll("");
      String[] numberList = splitString.split(separator);

      int number = 0;
      for (String n : numberList) {
        number += Integer.parseInt(n);
      }

      return number;
    }

    return 0;
  }

  boolean isEmptyString(String valueOfString) {
    return valueOfString == null || valueOfString.equals("") || valueOfString.equals(" ");
  }

  String getSeparator(Matcher matcher) {
    String separatorGroup = matcher.toString();
    String separator = separatorGroup.substring(2, 1);

    return separator;
  }
}
