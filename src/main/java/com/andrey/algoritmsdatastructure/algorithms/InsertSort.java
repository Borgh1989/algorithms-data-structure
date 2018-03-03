package com.andrey.algoritmsdatastructure.algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Andrey Yurkevich
 */
@Slf4j
public class InsertSort {

    public static List<Integer> sort(final List<Integer> numbers) {
        final List<Integer> sortedList = new LinkedList<>();

        originalList: for (Integer number : numbers) {
            for (int i = 0; i < sortedList.size(); i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }

        return sortedList;
    }
}
