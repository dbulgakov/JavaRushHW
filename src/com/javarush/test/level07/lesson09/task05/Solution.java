package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream iStream = System.in;
        Reader iReader = new InputStreamReader(iStream);
        BufferedReader bReader = new BufferedReader(iReader);
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            list.add(bReader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for(String item : result)
        {
            System.out.println(item);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        ArrayList<String> newList = new ArrayList<String>();
        for(String item : list)
        {
            newList.add(item);
            newList.add(item);
        }
        return newList;
    }
}
