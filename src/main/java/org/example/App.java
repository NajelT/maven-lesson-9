package org.example;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> list1 = new ArrayList<>();
        list1.add("list1");
        list1.add("list2");

        List<String> list2 = new LinkedList<>();
        list2.add("list3");
        list2.add("list4");

        System.out.println(list1);
    }




}
