package ru.muctr.Questions;

import java.util.function.BiFunction;

/**
 * @author Evgenia Skichko
 */
public class Question4 {
    public static void main(String[] args) {
        BiFunction<String, String, Boolean> g =
                String::contains;
    }
}
