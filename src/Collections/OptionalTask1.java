package Collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class OptionalTask1 {

    public static void main(String[] args)throws Exception {
        FileReader fileReader = new FileReader("src/stringFile.txt");
        Scanner scanner = new Scanner(fileReader);
        String textFromFile = "";
        //List<String> words = new ArrayList<>();
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

        FileWriter fileWriter = new FileWriter("src/stringFile.txt");
        fileWriter.write(textFromFile);
        fileWriter.close();

    }
}
