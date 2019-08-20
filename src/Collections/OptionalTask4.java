//Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalTask4 {

    public static void main(String[] args) {
        String poem = "“I cannot go to school today,\nSaid little Peggy Ann McKay.\n“I have the measles and the mumps,\nA gash, a rash and purple bumps.";

        Pattern pattern = Pattern.compile("\\p{Alnum}+");
        Matcher matcher = pattern.matcher(poem);
        ArrayList<String>wordsFromPoem = new ArrayList<>();
        while (matcher.find())
        {
            wordsFromPoem.add(matcher.group());
        }
        wordsFromPoem.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        wordsFromPoem.forEach(System.out::println);

    }
}