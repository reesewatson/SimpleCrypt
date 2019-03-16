package Main;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;



public class ROT13  {

    int shift;

    public ROT13(Character cs, Character cf) {
        shift = cf - cs;
    }

    public ROT13() {
        shift = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetter(text.charAt(i))) {
                result.append(text.charAt(i)); }
            else if (Character.isUpperCase(text.charAt(i)))
                {
                    char ch = (char)(((int)text.charAt(i) +
                            shift - 65) % 26 + 65);
                    result.append(ch); }
                else {
                    char ch = (char)(((int)text.charAt(i) +
                            shift - 97) % 26 + 97);
                    result.append(ch); }
            }
        return result.toString();

    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        String result = "";
        int index = s.indexOf(c);
        result += s.substring(index);
        return result + s.substring(0, index);
    }

}
