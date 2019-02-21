package s13;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        while (s.indexOf("CM") != -1) {
            result = result + 900;
            s = s.replaceFirst("CM", "");
        }

        while (s.indexOf("CD") != -1) {
            s = s.replaceFirst("CD", "");
            result = result + 400;
        }
        while (s.indexOf("XC") != -1) {
            s = s.replaceFirst("XC", "");
            result = result + 90;
        }
        while (s.indexOf("XL") != -1) {
            s = s.replaceFirst("XL", "");
            result = result + 40;
        }
        while (s.indexOf("IV") != -1) {
            s = s.replaceFirst("IV", "");
            result = result + 4;
        }
        while (s.indexOf("IX") != -1) {
            s = s.replaceFirst("IX", "");
            result = result + 9;
        }
        while (s.indexOf("M") != -1) {
            s = s.replaceFirst("M", "");
            result = result + 1000;
        }
        while (s.indexOf("M") != -1) {
            s = s.replaceFirst("M", "");
            result = result + 1000;
        }
        while (s.indexOf("D") != -1) {
            s = s.replaceFirst("D", "");
            result = result + 500;
        }
        while (s.indexOf("C") != -1) {
            s = s.replaceFirst("C", "");
            result = result + 100;
        }
        while (s.indexOf("L") != -1) {
            s = s.replaceFirst("L", "");
            result = result + 50;
        }
        while (s.indexOf("X") != -1) {
            s = s.replaceFirst("X", "");
            result = result + 10;
        }
        while (s.indexOf("V") != -1) {
            s = s.replaceFirst("V", "");
            result = result + 5;
        }
        while (s.indexOf("I") != -1) {
            s = s.replaceFirst("I", "");
            result = result + 1;
        }
        return result;
    }
}