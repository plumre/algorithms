package com.plumre.chapter0;

import java.util.Arrays;

public class StringTest {

    /**
     * 判断一个字符串是否是回文
     * @param s 字符串
     * @return true为真 false为假
     */
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++) {
            if (s.charAt(i) != s.charAt(N - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 提取文件名和拓展名
     * @param s 字符串
     * @return 字符串数组
     */
    public static String[] extractFilename(String s) {
        String[] strings = new String[2];
        int dot = s.indexOf(".");
        String base = s.substring(0, dot);
        String extension = s.substring(dot + 1, s.length());
        strings[0] = base;
        strings[1] = extension;
        return strings;
    }

    /**
     * 检查字符串数组中的元素是否按字母表排序
     * @param a 字符串数组
     * @return true为真 false为假
     */
    public static boolean isSorted(String[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].compareTo(a[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abcba";
        String s2 = "Gone With The Wind.mkv";
        String[] s3 = {"apple", "banana", "chip", "green", "light"};
        System.out.println(s1 + " - " + isPalindrome(s1));
        System.out.println(s2 + " - " + Arrays.toString(extractFilename(s2)));
        System.out.println(Arrays.toString(s3) + " - " + isSorted(s3));
    }

}
