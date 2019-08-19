//В заданном тексте найти сумму всех встречающихся цифр.
package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalTask_Chapter3_Task1 {

    public static int sumAllNumbersInString(String string)
    {
        int sumAllNumbersInString = 0;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(string);
        System.out.print("Numbers: ");
        while(matcher.find())
        {
            System.out.print(matcher.group()+" ");
            sumAllNumbersInString +=  Integer.parseInt(matcher.group());
        }
        System.out.println();
        System.out.print("Sum = ");
        return sumAllNumbersInString;
    }
    public static void main(String[] args) {
        System.out.println(sumAllNumbersInString("hgjg 68g hjg78jkb hkj89ykjhk"));
    }
}