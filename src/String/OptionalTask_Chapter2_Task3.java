//В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.
package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalTask_Chapter2_Task3 {

    public static int findAmountOfWorldsWithFirstAndLastVowelLetters(String poem)
    {
        int AmountOfWorldsWithFirstAndLastVowelLetters = 0;
        Pattern pattern = Pattern.compile("(\\s[aeiouAEIOU]|[AEIOU])\\w*\\d*[aeiou](\\s+|\\p{Punct}+)");
        Matcher matcher = pattern.matcher(poem);
        while (matcher.find())
        {
            AmountOfWorldsWithFirstAndLastVowelLetters++;
        }
        return AmountOfWorldsWithFirstAndLastVowelLetters;
    }
    public static void main(String[] args) {
        String poem = "Because today our hands unravel a perfect orange\n" +
                "we each left our homes\n" +
                "drank ripening light before boarding\n" +
                "put our hands together into red soil\n" +
                "we each left home\n" +
                "to place new juice in our mouths\n" +
                "put our hands together into red soil\n" +
                "kept our eyes open...";
        System.out.println("There are "+ findAmountOfWorldsWithFirstAndLastVowelLetters(poem)+" words with first and last vowel letters");
    }
}
