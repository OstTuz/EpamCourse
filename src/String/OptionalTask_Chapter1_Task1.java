//В каждом слове текста k-ю букву заменить заданным символом. Если k
//больше длины слова, корректировку не выполнять. В каждом слове текста k-ю букву заменить заданным символом. Если k
//больше длины слова, корректировку не выполнять.
package String;


public class OptionalTask_Chapter1_Task1 {

    public static String changeLetters(String string, int letterPosition)
    {
        String[] worlds = string.strip().split("\\s+");
        String resultString = "";

        for (int i = 0; i < worlds.length; i++)
        {
            if (letterPosition <= worlds[i].length())
            {
                for (int j = 0; j < worlds[i].length(); j++)
                {
                    if (j == letterPosition - 1) continue;

                    resultString = resultString + worlds[i].charAt(j);
                }
                resultString = resultString + " ";
            }else
            {
                resultString = resultString + worlds[i]+" ";
            }
        }
        return resultString;
    }
    public static void main(String[] args) {
        String str = "Java is the most famous language in the world";
        System.out.println(str);
        System.out.println(changeLetters(str, 3));
    }
}
