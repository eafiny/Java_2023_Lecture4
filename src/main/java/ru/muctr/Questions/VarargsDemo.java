package ru.muctr.Questions;

import java.util.Arrays;

/**
 * @author Evgenia Skichko
 */
public class VarargsDemo {
    public static void main(String[] args) {
        String[] strings = makeArray("java", "python", "kotlin");
        System.out.println(Arrays.toString(strings));
    }

    private static String[] makeArray(String... langs ) {
        System.out.println(langs[0]);
        return langs;
    }
}
