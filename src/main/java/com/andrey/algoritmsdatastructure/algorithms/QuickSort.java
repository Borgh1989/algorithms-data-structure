package com.andrey.algoritmsdatastructure.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Yurkevich
 */
public class QuickSort {

    public static List<Integer> sort(List<Integer> list) {
        if(list.size() < 2) {
            return list;
        }

        int pivot = list.get(0);
        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) < pivot) {
                lower.add(list.get(i));
            }
            else {
                higher.add(list.get(i));
            }
        }
        List<Integer> result = sort(lower);
        result.add(pivot);
        result.addAll(sort(higher));
        return result;
    }
}
