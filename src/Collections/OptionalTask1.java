//Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
package Collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class OptionalTask1 {

    public static void main(String[] args)throws Exception {
        FileReader fileReader = new FileReader("data/stringFile.txt");
        Scanner scanner = new Scanner(fileReader);
        String textFromFile = "";

        while (scanner.hasNext())
        {
                textFromFile = textFromFile + scanner.nextLine();
        }
        fileReader.close();

        List<String> words = Arrays.asList(textFromFile.split("\\s|\\n"));
        Collections.reverse(words);

        textFromFile = "";
        for (String world : words)
        {
            textFromFile += world + " ";
        }

        FileWriter fileWriter = new FileWriter("data/stringFile.txt");
        fileWriter.write(textFromFile);
        fileWriter.close();

    }
}
