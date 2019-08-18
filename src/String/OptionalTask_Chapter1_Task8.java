//Удалить из текста его часть, заключенную между двумя символами, которые вводятся
//(например, между скобками «(» и «)» или между звездочками «*» и т. п.).

package String;

public class OptionalTask_Chapter1_Task8 {

    public static StringBuilder deleteTextBetween(StringBuilder string, char startSign, char endSign)throws Exception
    {
        int deleteFrom = 0;
        int deleteTo = 0;
        int amountSimilarSignes = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == startSign)
            {
                deleteFrom = i+1;
                break;
            }else continue;
        }

        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == endSign)
            {
                deleteTo = i;
                amountSimilarSignes++;
            }else continue;
        }

        if((startSign == endSign && amountSimilarSignes < 2)||(string.charAt(0) != startSign && deleteFrom == 0) || deleteTo == 0) throw new Exception("There are no brackets!!!");

        string.delete(deleteFrom, deleteTo);
        return string;
    }

    public static String deleteTextBetweenAnother(StringBuilder string, String startSign, String endSign)throws Exception
    {
        int numberOfSecondBrecket = string.lastIndexOf(endSign);
        string.reverse();
        int numberOfFirstBracket = string.length() - string.lastIndexOf(startSign);
        string.reverse();
        String resultString = string.substring(0, numberOfFirstBracket) + string.substring(numberOfSecondBrecket, string.length());
        return resultString;
    }

    public static void main(String[] args)throws Exception {
        StringBuilder string = new StringBuilder("H(e*llo J)a*va!!!");
        System.out.println(string);
        System.out.println(deleteTextBetweenAnother(string, "*", "*"));
        System.out.println(deleteTextBetween(string, '(', ')'));

    }
}
