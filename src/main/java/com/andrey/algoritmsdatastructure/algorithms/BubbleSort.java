package com.andrey.algoritmsdatastructure.algorithms;

import java.util.List;

/**
 * @author Andrey Yurkevich
 */
public class BubbleSort {

    public static List<Integer> sort(List<Integer> numbers) {
        boolean numbersSwitched;
        do {
            numbersSwitched = false;
            for (int i = 0; i < numbers.size()-1; i++) {
                if(numbers.get(i+1) < numbers.get(i)) {
                    int temp = numbers.get(i+1);
                    numbers.set(i+1, numbers.get(i));
                    numbers.set(i, temp);
                    numbersSwitched = true;
                }
            }
        } while(numbersSwitched);
        return numbers;
    }
}
