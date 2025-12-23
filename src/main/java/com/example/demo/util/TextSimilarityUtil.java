package com.example.demo.util;

public class TextSimilarityUtil {

    private TextSimilarityUtil() {
    }

    public static double similarity(String a, String b) {
        if (a == null || b == null) {
            return 0.0;
        }
        if (a.equalsIgnoreCase(b)) {
            return 1.0;
        }
        return 0.0;
    }
}
