package ru.muctr.Generics;

import lombok.*;

/**
 * @author Evgenia Skichko
 */
@Setter
@Getter
@AllArgsConstructor
public class GenericBox<T extends Number> {
    private T obj;
}
