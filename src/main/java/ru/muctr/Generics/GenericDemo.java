package ru.muctr.Generics;

/**
 * @author Evgenia Skichko
 */
public class GenericDemo {
    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>(6);
        GenericBox<Double> doubleBox = new GenericBox<>(6.0);
        GenericBox<Number> numberBox = new GenericBox<>(6.0);
//        numberBox = intBox;  //Ошибка компиляции
//        doubleBox = intBox;  //Ошибка компиляции
        sum(intBox, doubleBox);
    }

    private static Number sum(GenericBox<?> box1, GenericBox<?> box2) {
        return box1.getObj().doubleValue() + box2.getObj().doubleValue();
    }
}
