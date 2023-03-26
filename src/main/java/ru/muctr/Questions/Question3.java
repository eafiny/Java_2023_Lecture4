package ru.muctr.Questions;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

/**
 * @author Evgenia Skichko
 */
public class Question3 {
    public static void main(String[] args) {
        UnaryOperator<Float> l1 = x -> x * 3;

        BiPredicate<String, String> l2 = (s1, s2) -> s1.contains(s2);

    }
}
