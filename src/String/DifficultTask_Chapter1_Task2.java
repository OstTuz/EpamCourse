//Исключить из текста подстроку максимальной длины, начинающуюся и за-канчивающуюся одним и тем же символом.
package String;

public class DifficultTask_Chapter1_Task2 {
    public static String deleteMaxLengthStringBettweenSameLetters(String string)
    {
        String resultString = "";
        String str = "";
       for (int i = 0; i < string.length() - 1; i++)
       {
           if (i!=string.lastIndexOf(string.charAt(i)))
           {
               str = string.substring(i+1, string.lastIndexOf(string.charAt(i)));
           }else continue;

           if (resultString.length() < str.length()) resultString = str;
       }
       return resultString;
    }
    public static void main(String[] args) {
        String string = "!@&wsomeWordsBetweenandeinTheEnd";
        System.out.println(deleteMaxLengthStringBettweenSameLetters(string));
    }
}
