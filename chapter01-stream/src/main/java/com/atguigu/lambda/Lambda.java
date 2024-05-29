package com.atguigu.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;

@FunctionalInterface
interface MyInterface {
    int sum(int i,int j);
}

class MyInterfaceImpl implements MyInterface {
    @Override
    public int sum(int i,int j) {
        System.out.println("sum = " + (i + j));
        return i + j;
    }
}

public class Lambda {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (s1, s2) -> {
            System.out.println(s1 + s2);
        };

    }
    public static void bb(String[] args) {
//        List<String>  list  =new ArrayList<String>();
        var names =  new ArrayList<String>();


        names.add("aaa");
        names.add("bbb");
        names.add("ccc");
        names.add("dddd");
        // 实例化一个比较器
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
        // 使用lambda表达式
//        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
//        System.out.println(names);
        // 类 :: 静态方法
//        Collections.sort(names,String::compareTo);
        Collections.sort(names,Collections.reverseOrder(String::compareTo));
          System.out.println(names);

//        aaa(args);
    }
    /**
     * lambda 的实现：类似起前端的剪头函数，但是要求忌口interface 是函数接口：
     * 函数接口：只有一个方法的接口 or 有多个方法但是有一个方法是default方法
     * @param args
     */
    public static void aaa(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl();
        System.out.println(myInterface.sum(1, 2));
        MyInterface myInterface2 = (i, j) -> {
            System.out.println("sum = " + (i + j));
            return i + j;
        };
        MyInterface myInterface3 = (i, j) -> {
            System.out.println("sum = " + (i + j));
            return i + j;
        };
        myInterface2.sum(1,3);
        myInterface3.sum(1,3);


    }
}