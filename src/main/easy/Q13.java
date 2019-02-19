package main.easy;

import java.util.HashMap;
import java.util.Map;

public class Q13 {

    /*public static int romanToInt(String s) {
        int result = 0;
        String[] romans = s.split("");
        for (int i = 0; i < romans.length ; i++) {
            if (i+1 < romans.length) {
                if (romans[i].equals("I")) {
                    if (romans[i+1].equals("V")) {
                        result += 4;
                        i++;
                    } else if (romans[i+1].equals("X")) {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                } else if (romans[i].equals("V")) {
                    result += 5;
                } else if (romans[i].equals("X")) {
                    if (romans[i+1].equals("L")) {
                        result += 40;
                        i++;
                    } else if (romans[i+1].equals("C")) {
                        result += 90;
                        i++;
                    } else {
                        result += 10;
                    }
                } else if (romans[i].equals("L")) {
                    result += 50;
                } else if (romans[i].equals("C")) {
                    if (romans[i+1].equals("D")) {
                        result += 400;
                        i++;
                    } else if (romans[i+1].equals("M")) {
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                } else if (romans[i].equals("D")) {
                    result += 500;
                } else if (romans[i].equals("M")) {
                    result += 1000;
                }
            } else {
                switch (romans[i]) {
                    case "I":
                        result += 1;
                        break;
                    case "V":
                        result += 5;
                        break;
                    case "X":
                        result += 10;
                        break;
                    case "L":
                        result += 50;
                        break;
                    case "C":
                        result += 100;
                        break;
                    case "D":
                        result += 500;
                        break;
                    case "M":
                        result += 1000;
                        break;
                }
            }

        }
        return result;
    }*/

    public static int romanToInt(String s) {
        int result = 0;
        String[] romans = s.split("");
        for (int i = 0; i < romans.length; i++) {
            switch (romans[i]) {
                case "I" : result += 1; break;
                case "V" : result += 5; break;
                case "X" : result += 10; break;
                case "L" : result += 50; break;
                case "C" : result += 100; break;
                case "D" : result += 500; break;
                case "M" : result += 1000; break;
            }
            if (i > 0) {
                if ((romans[i].equals("V") || romans[i].equals("X")) && (romans[i-1].equals("I"))) {
                    result -= 2;
                } else if ((romans[i].equals("L") || romans[i].equals("C")) && (romans[i-1].equals("X"))) {
                    result -= 20;
                } else if ((romans[i].equals("D") || romans[i].equals("M")) && (romans[i-1].equals("C"))) {
                    result -= 200;
                }
            }
        }
        return result;
    }
}
