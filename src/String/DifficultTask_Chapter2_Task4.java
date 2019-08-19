//Текст шифруется по следующему правилу: из исходного текста выбирается 1, 4, 7, 10-й и т. д.
//(до конца текста) символы, затем 2, 5, 8, 11-й и т. д. (до конца текста) символы,
//затем 3, 6, 9, 12-й и т. д.
//Зашифровать заданный текст.
package String;

public class DifficultTask_Chapter2_Task4 {

    public static String codeString(String stringToCode)
    {
        String code = "";
        for (int i = 0; i < 3; i++)
        {
            for (int j = i; j < stringToCode.length(); j=j+3)
            {
                if (j <= stringToCode.length())
                {
                    code = code + stringToCode.charAt(j);
                }else break;
            }
        }
        return code;
    }
    public static void main(String[] args) {
        String string = "123456789ab";
        System.out.println(codeString(string));
    }
}
