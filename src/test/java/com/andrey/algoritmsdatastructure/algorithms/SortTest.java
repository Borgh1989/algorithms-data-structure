package com.andrey.algoritmsdatastructure.algorithms;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@Slf4j
public class SortTest {

    private List<Integer> list;
    private List<Integer> expectedList;

    @Before
    public void setUp() {
        list = new ArrayList<>(Arrays.asList(3, 4, 8, 5, 10, 2));
        expectedList = Arrays.asList(2, 3, 4, 5, 8, 10);
    }

    @Test
    public void insertSort() {
        List<Integer> sortedList = InsertSort.sort(list);

        assertEquals(expectedList, sortedList);
        log.info(sortedList.toString());
    }

    @Test
    public void bubbleSort() {
        List<Integer> sortedList = BubbleSort.sort(list);

        assertEquals(expectedList, sortedList);
        log.info(sortedList.toString());
    }

    @Test
    public void quickSort() {
        List<Integer> sortedList = QuickSort.sort(list);

        assertEquals(expectedList, sortedList);
        log.info(sortedList.toString());
    }

    @Test
    public void mergeSort() {
        List<Integer> sortedList = MergeSort.sort(list);

        assertEquals(expectedList, sortedList);
        log.info(sortedList.toString());
    }
}
