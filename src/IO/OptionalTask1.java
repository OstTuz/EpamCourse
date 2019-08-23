//Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
package IO;

import java.io.*;
import java.util.Arrays;

public class OptionalTask1 {
    public static void main(String[] args) {
        File fileNumbers = new File("data/numbers.txt");

        final int AMOUNT_OF_NUMBERS = 18;

        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        {
            try {
                fileOutputStream = new FileOutputStream(fileNumbers);
                byte[] randomNumbersForFile = new byte[AMOUNT_OF_NUMBERS];
                for (int i = 0; i < AMOUNT_OF_NUMBERS; i++)
                {
                    randomNumbersForFile[i] = (byte) (48+Math.random()*10);
                }
                fileOutputStream.write(randomNumbersForFile);
                fileOutputStream.close();

                fileInputStream = new FileInputStream(fileNumbers);
                byte[]bytes = new byte[AMOUNT_OF_NUMBERS];
                fileInputStream.read(bytes);
                fileInputStream.close();
                Arrays.sort(bytes);

                fileOutputStream = new FileOutputStream(fileNumbers);
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
