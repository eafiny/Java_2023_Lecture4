package ru.muctr.Questions;

/**
 * @author Evgenia Skichko
 */
class Generic <T extends Number> {
    private T obj;
}

public class Question1{
    Generic<Double> doubleBox = new Generic<>();
    Generic<?> numberBox = doubleBox;
}

