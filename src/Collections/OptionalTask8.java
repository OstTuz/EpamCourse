//Задан файл с текстом на английском языке. Выделить все различные слова.
//Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet
package Collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalTask8 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/textForOptionalTask8.txt");
        Scanner scanner = new Scanner(fileReader);
        String stringFromFile = "";
        while (scanner.hasNext())
        {
            stringFromFile = scanner.nextLine();
        }
        fileReader.close();

        Set<String> setOfWords = new HashSet<>();

        Pattern pattern = Pattern.compile("\\p{Alnum}+");
        Matcher matcher = pattern.matcher(stringFromFile);

        while (matcher.find())
        {
            setOfWords.add(matcher.group().toLowerCase());
        }
        System.out.println(setOfWords);
    }
}
