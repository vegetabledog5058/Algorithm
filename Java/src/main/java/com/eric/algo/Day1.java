package com.eric.algo;

public class Day1 {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "buts"));
    }

    /*给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
    单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
    示例 1：
    输入：s = "Hello World"
    输出：5
    解释：最后一个单词是“World”，长度为 5。
    示例 2：
    输入：s = "   fly me   to   the moon  "
    输出：4
    解释：最后一个单词是“moon”，长度为 4。
    示例 3：
    输入：s = "luffy is still joyboy"
    输出：6
    解释：最后一个单词是长度为 6 的“joyboy”。
    提示：
    1 <= s.length <= 104
    s 仅有英文字母和空格 ' ' 组成
    s 中至少存在一个单词*/
    static int lengthOfLastWord(String s) {
        int length = s.length();
        int res = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && res == 0) continue;
            res++;

        }
        return res;
    }

    /*示例 1：

    输入：haystack = "sadbutsad", needle = "sad"
    输出：0
    解释："sad" 在下标 0 和 6 处匹配。
    第一个匹配项的下标是 0 ，所以返回 0 。
    示例 2：

    输入：haystack = "leetcode", needle = "leeto"
    输出：-1
    解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。*/
    static int strStr(String haystack, String needle) {
//sad
//asad
        if (haystack == null || needle == null) {
            return -1;
        }
        int length = needle.length();
        if (haystack.substring(0, length).equals(needle)) {
            return 0;
        }
        for (int i = length; i < haystack.length(); i++) {
            for (int j = 0; j < length; j++) {
                if (haystack.charAt(i + j - (length - 1)) == needle.charAt(i + j - (length - 1))) {
                    continue;
                }
                if (j == length - 1) {
                    return i - (length - 1);
                }
            }
        }
        return -1;
    }
}
