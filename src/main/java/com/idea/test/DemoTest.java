package com.idea.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class DemoTest {

    public static void main(String[] args) {
//        String[] arr = {"apple", "pear", "orange"};
//        List<String> list = Arrays.asList(arr);
//        arr[0] = "aaa";
//        System.out.println(list);


        int[] arrInt = {1, 2, 3};
        List<int[]> ints = Arrays.asList(arrInt);
//        System.out.println(ints.size());
//        System.out.println(ints.get(0));//数组地址值
//        System.out.println(ints.get(1));//ArrayIndexOutOfBoundsException

        int[] ints1 = ints.get(0);
        System.out.println(ints1[0]);

//        Integer[] arr2 = {1, 2, 3};
//        List<Integer> integers = Arrays.asList(arr2);
//        System.out.println(integers.size());//3
//        System.out.println(integers.get(0));//1

        List list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Integer[] arr2 = {1, 2, 3};
//        List<Integer> mylist = Arrays.stream(arr2).collect(Collectors.toList());
        int[] arr3 = {1, 2, 3};//基本类型
//        List<Integer> mylist2 = Arrays.stream(arr3).boxed().collect(Collectors.toList());

        List<String> list1 = new ArrayList<>();


    }
}
