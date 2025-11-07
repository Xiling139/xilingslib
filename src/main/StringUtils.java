package main;

public class StringUtils {

    public static String xiToUpperCase(String str) {
        if (str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] += (char)('A' - 'a');
            }
        }
        return new String(chars);
    }

    public static String xiToLowerCase(String str) {
        if (str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += (char)('z' - 'Z');
            }
        }
        return new String(chars);
    }

    private static boolean isBlank(char c) {
        if ((c >= '\t' && c <= '\r') || c == ' ') {
            return true;
        }
        return false;
    }

    public static String xiTrim(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        while (i < chars.length && isBlank(chars[i])) {
            i++;
        }
        int start = i;
        i = chars.length - 1;
        while (i >= 0 && isBlank(chars[i])) {
            i--;
        }
        int end = i;
        int newlen = (end >= start) ? end - start + 1 : 0;
        char[] newChars = new char[newlen];
        for (int j = 0; j < newlen; j++) {
            newChars[j] = chars[start + j];
        }
        return new String(newChars);
    }
}
