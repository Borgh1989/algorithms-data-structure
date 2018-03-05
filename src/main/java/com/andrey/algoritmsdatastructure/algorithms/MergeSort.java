package com.andrey.algoritmsdatastructure.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Yurkevich
 */
public class MergeSort {

    public static List<Integer> sort(List<Integer> list) {
        if(list.size() < 2) {
            return list;
        }

        List<Integer> left = list.subList(0, list.size()/2);
        List<Integer> right = list.subList(list.size()/2, list.size());

        return merge(sort(left), sort(right));
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {

        int leftPoint = 0;
        int rightPoint = 0;

        List<Integer> merged = new ArrayList<>(left.size() + right.size());

        while(leftPoint < left.size() && rightPoint < right.size()) {
            if(left.get(leftPoint) < right.get(rightPoint)) {
                merged.add(left.get(leftPoint));
                leftPoint ++;
            } else {
                merged.add(right.get(rightPoint));
                rightPoint ++;
            }
        }

        while(leftPoint < left.size()) {
            merged.add(left.get(leftPoint));
            leftPoint ++;
        }
        while(rightPoint < right.size()) {
            merged.add(right.get(rightPoint));
            rightPoint ++;
        }
        return merged;
    }
}
