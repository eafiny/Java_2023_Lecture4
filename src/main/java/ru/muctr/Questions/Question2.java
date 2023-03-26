package ru.muctr.Questions;

/**
 * @author Evgenia Skichko
 */

interface NewFunctional{
    double calculate(double d);
}

public class Question2 {
    public static void main(String[] args) {
        NewFunctional nf = x -> 100.0;
    }
}
