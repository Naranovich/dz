package org.example;

public class task4 {

    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b')); // ababab

        System.out.println(strRLE("aaaabbbcdd"));
    }

    private static boolean strRLE(String aaaabbbcdd) {
        return false;
    }

    private static String buildString(int n, char first, char second) {
        String str = new String();
        for (int i = 0; i < n; i++) {
            str += (i % 2 == 0) ? first : second;
        }
        return str;
    }
}
