package com.idea.test;

import com.idea.bean.Customer;

import java.util.ArrayList;

/**
 * 快捷键
 * settings -- editor -- general -- postfix completion
 * settings -- editor -- live templates
 *
 * @author zhongm
 * @date 2020/2/12 16:06
 */
public class Keymap {
    // prsf private static final
    private static final Customer cust = new Customer();

    //psf public static final
    public static final int NUM = 1;

    //psfi public static final int
    public static final int num2 = 2;

    //psfs public static final String
    public static final String nation = "china";

    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("hello world");
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm method name
        System.out.println("Customer.main");
        //soutv v代表num v就近选择变量
        int num = 10;
        System.out.println("num = " + num);
        //num.sout
        System.out.println(num);

        // fori
        String[] arr = new String[]{"a", "v", "c"};
        for (int i = 0; i < arr.length; i++) {
            //arr[i].sout
            System.out.println(arr[i]);
        }

        // iter
        for (String s : arr) {
            System.out.println(s);
        }

        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        // list.for
        list.add(111);
        list.add(222);
        list.add(333);
        for (Object o : list) {

        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method() {
        ArrayList list = new ArrayList();
        // list.for
        list.add(111);
        list.add(222);
        list.add(333);
        // ifn
        if (list == null) {
        }

        // inn
        if (list != null) {
        }

        //xxx.nn
        if (list != null) {
        }

        //xxx.null
        if (list == null) {
        }
    }

}
